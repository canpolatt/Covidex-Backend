package project.covidex.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AddProtocolDetailDto {
	@NotNull(message = "Bu alan bırakılamaz")
	private int protocolId;
	@NotBlank(message ="Bu alan boş bırakılamaz")
	private String identityNumber;
	private String details;
	private String name_of_doctor;
	private LocalDate dateOfProtocol;
	
}
