package project.covidex.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
		return this.protocolService.add(protocol);
	}
}
