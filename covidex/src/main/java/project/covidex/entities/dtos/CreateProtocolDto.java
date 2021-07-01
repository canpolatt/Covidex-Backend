package project.covidex.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CreateProtocolDto {
	@NotBlank(message = "Bu alan boş bırakılamaz!!!")
	private String identityNumber;
	private LocalDate dateOfProtocol;
	private String details;
	private String name_of_doctor;
	
}
