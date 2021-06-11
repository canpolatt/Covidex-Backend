package project.covidex.api.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.DoctorService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.Doctor;
import project.covidex.entities.dtos.DoctorRegisterDto;


@RestController
@RequestMapping("/api/doctors")
@CrossOrigin
public class DoctorsController {
	private DoctorService doctorService;

	@Autowired
	public DoctorsController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	
	@GetMapping("/getById")
	DataResult<Doctor> getByDoctorId(@RequestParam int id){
		return this.doctorService.getByDoctorId(id);
	}
	
	@PostMapping("/add")
	DataResult<Doctor> add(@Valid @RequestBody DoctorRegisterDto doctorRegisterDto){
		Doctor doctor=new Doctor();	
		doctor.setUserIdentity(doctorRegisterDto.getIdentityNumber());
		doctor.setFirstName(doctorRegisterDto.getFirstName());
        doctor.setLastName(doctorRegisterDto.getLastName());
        doctor.setDoctorIdentity(doctorRegisterDto.getIdentityNumber());
        doctor.setPassword(doctorRegisterDto.getPassword());
        doctor.setGender(doctorRegisterDto.getGender());
        doctor.setSpecId(doctorRegisterDto.getSpecId());
        doctor.setBirthDate(doctorRegisterDto.getBirthdate());
        doctor.setCreatedDate(LocalDate.now());
        return this.doctorService.add(doctor);
	}
	

}
