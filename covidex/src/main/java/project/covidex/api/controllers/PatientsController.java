package project.covidex.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.PatientService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.Patient;
import project.covidex.entities.dtos.PatientRegisterDto;


@RestController
@RequestMapping("/api/patients")
@CrossOrigin
public class PatientsController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/add")
	DataResult<Patient> add(@Valid @RequestBody PatientRegisterDto patientRegisterDto){
		Patient patient=new Patient();
		patient.setFirstName(patientRegisterDto.getFirstName());
		patient.setLastName(patientRegisterDto.getLastName());
		patient.setIdentityNumber(patientRegisterDto.getIdentityNumber());
		patient.setGender(patientRegisterDto.getGender());
		patient.setBirthDate(patientRegisterDto.getBirthDate());
		patient.setStatus(patientRegisterDto.isStatus());
		patient.setAddress(patientRegisterDto.getAddress());
		patient.setBloodType(patientRegisterDto.getBloodType());
		patient.setNameOfMother(patientRegisterDto.getNameOfMother());
		patient.setNameOfFather(patientRegisterDto.getNameOfFather());
		return this.patientService.add(patient);
	}

}
