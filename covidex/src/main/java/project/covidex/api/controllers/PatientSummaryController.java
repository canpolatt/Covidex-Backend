package project.covidex.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.PatientSummaryService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.PatientSummary;

@RestController
@RequestMapping("/api/patientsummary")
@CrossOrigin
public class PatientSummaryController {

	private PatientSummaryService patientSummaryService;
	
	@Autowired
	public PatientSummaryController(PatientSummaryService patientSummaryService) {
		super();
		this.patientSummaryService = patientSummaryService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<PatientSummary>> getAll(){
		return this.patientSummaryService.getAll();
	}
	
	@GetMapping("/getByIdentity")
	public DataResult<List<PatientSummary>> getByuserIdentity(@RequestParam String userIdentity) {
			return this.patientSummaryService.getByIdentity(userIdentity);
	}
	

}
