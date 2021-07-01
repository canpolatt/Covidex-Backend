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

import project.covidex.business.abstracts.ProtocolService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.Protocol;
import project.covidex.entities.dtos.CreateProtocolDto;

@RestController
@RequestMapping("/api/protocols")
@CrossOrigin
public class ProtocolsController {
	@Autowired
	private ProtocolService protocolService;
	
	
	@PostMapping("/add")
	public DataResult<Protocol> add(@Valid @RequestBody CreateProtocolDto protocolDto){
		Protocol protocol=new Protocol();
		protocol.setIdentityNumber(protocolDto.getIdentityNumber());
		protocol.setDateOfProtocol(protocolDto.getDateOfProtocol());
		protocol.setDetail(protocolDto.getDetails());
		protocol.setNameOfDoctor(protocolDto.getName_of_doctor());
		return this.protocolService.add(protocol);
	}
	
	@GetMapping("/getProtocolsByIdentityNumber")
	public List<Protocol> getProtocolsByIdentityNumber(@RequestParam String identityNumber) {
		return this.protocolService.findAllIdentityNumber(identityNumber);
	}
}
