package project.covidex.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.DoctorContactService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.DoctorContact;
import project.covidex.entities.dtos.DoctorContactDto;

@RestController
@RequestMapping("/api/doctorcontacts")
public class DoctorContactsController {
	private DoctorContactService doctorContactService;

	public DoctorContactsController(DoctorContactService doctorContactService) {
		super();
		this.doctorContactService = doctorContactService;
	}
	
	@PostMapping("/add")
	DataResult<DoctorContact> add(@RequestBody DoctorContactDto doctorContactDto){
		DoctorContact doctorContact=new DoctorContact();
		doctorContact.setId(doctorContactDto.getDoctorId());
		doctorContact.setPhone(doctorContactDto.getPhone());
		doctorContact.setEmail(doctorContactDto.getEmail());
		doctorContact.setAddress(doctorContactDto.getAddress());
		return this.doctorContactService.add(doctorContact);
	}
	

}
