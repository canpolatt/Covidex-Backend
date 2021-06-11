package project.covidex.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.LoginService;
import project.covidex.core.utilities.results.Result;
import project.covidex.entities.dtos.DoctorLoginDto;

@RestController
@RequestMapping("/api/authentication")
@CrossOrigin
public class LoginsController {
	@Autowired
	private LoginService loginService;
	
	
	
	@PostMapping("login")
	public Result login(@Valid @RequestBody DoctorLoginDto doctorLoginDto) {
		return this.loginService.login(doctorLoginDto);
	}

}
