package project.covidex.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.PatientService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.Result;
import project.covidex.entities.concretes.Patient;
import project.covidex.entities.dtos.PatientRegisterDto;
import project.covidex.entities.dtos.PatientWithProtocolDto;


@RestController
@RequestMapping("/api/patients")
@CrossOrigin
public class PatientsController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/getTotalCase")
	public int getTotalCase() {
		return this.patientService.getTotalCase();
	}
	
	@GetMapping("/getActiveCase")
	public int getActiveCase() {
		return this.patientService.getActiveCase();
	}
	
	
	@GetMapping("/getByIdentityNumber")
	Result findByidentityNumber(@RequestParam String identityNumber) {
		return this.patientService.getByidentityNumber(identityNumber);
	}
	
	@GetMapping("/getAllInformationByIdentityNumber")
	public DataResult<List<PatientWithProtocolDto>> getAllInformationByIdentityNumber(@RequestParam String identityNumber){
		return this.patientService.getAllInformationByIdentityNumber(identityNumber);
	}
	
	
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
