package project.covidex.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.ProtocolDetailService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.ErrorDataResult;
import project.covidex.entities.concretes.ProtocolDetail;
import project.covidex.entities.dtos.AddProtocolDetailDto;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/protocoldetails")
@CrossOrigin
public class ProtocolDetailsController {
	@Autowired
	private ProtocolDetailService protocolDetailService;
	
	@PostMapping("/add")
	public DataResult<ProtocolDetail> add(@Valid @RequestBody AddProtocolDetailDto protocolDetailDto){
		ProtocolDetail protocolDetail=new ProtocolDetail();
		protocolDetail.setProtocolId(protocolDetailDto.getProtocolId());
		protocolDetail.setIdentityNumber(protocolDetailDto.getIdentityNumber());
		protocolDetail.setDetail(protocolDetailDto.getDetails());
		protocolDetail.setNameOfDoctor(protocolDetailDto.getName_of_doctor());
		protocolDetail.setDateOfProtocol(protocolDetail.getDateOfProtocol());
		return this.protocolDetailService.add(protocolDetail);
	}
	
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ErrorDataResult<Object> handleValidationException
	            (MethodArgumentNotValidException exceptions){
	        Map<String,String> validationErrors = new HashMap<String, String>();
	        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
	            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
	        }

	        ErrorDataResult<Object> errors
	                = new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
	        return errors;
	    }


}
