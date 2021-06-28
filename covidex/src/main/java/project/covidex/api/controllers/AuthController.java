package project.covidex.api.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import project.covidex.business.abstracts.DoctorService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.dataAccess.abstracts.UserDao;
import project.covidex.entities.abstracts.User;
import project.covidex.entities.concretes.Doctor;
import project.covidex.entities.dtos.DoctorLoginDto;
import project.covidex.entities.dtos.DoctorRegisterDto;
import project.covidex.entities.dtos.TokenResponse;
import project.covidex.securityJwt.JwtTokenUtil;

import java.time.LocalDate;

@CrossOrigin
@RestController
@RequestMapping("/api/token/*")
@Api(value = "/api/token", description = "Token APIs Document")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /*  @Autowired
      private UsersBUS usersBUS;*/
    @Autowired
    private UserDao usersDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "/login", response = TokenResponse.class)
    public ResponseEntity<TokenResponse> login(@RequestBody DoctorLoginDto request) throws AuthenticationException {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        final User user = usersDAO.findByUserIdentity(request.getUsername());
        final String token = jwtTokenUtil.generateToken(user);
        return ResponseEntity.ok(new TokenResponse(user.getUserIdentity(), token));

    }


        @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation(value = "register", response = Boolean.class)
        DataResult<Doctor> register(@RequestBody DoctorRegisterDto doctorRegisterDto) throws AuthenticationException {
            Doctor doctor=new Doctor();
            doctor.setUserIdentity(doctorRegisterDto.getIdentityNumber());
            doctor.setFirstName(doctorRegisterDto.getFirstName());
            doctor.setLastName(doctorRegisterDto.getLastName());
            doctor.setDoctorIdentity(doctorRegisterDto.getIdentityNumber());
            doctor.setPassword(passwordEncoder.encode(doctorRegisterDto.getPassword()));
            doctor.setGender(doctorRegisterDto.getGender());
            doctor.setSpecId(doctorRegisterDto.getSpecId());
            doctor.setBirthDate(doctorRegisterDto.getBirthdate());
            doctor.setCreatedDate(LocalDate.now());
            return this.doctorService.add(doctor);
    }
}


