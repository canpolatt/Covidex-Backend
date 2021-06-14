package project.covidex.entities.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CreateProtocolDto {
	@NotBlank(message = "Bu alan boş bırakılamaz!!!")
	private String identityNumber;
}
