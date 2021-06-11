package project.covidex.entities.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class DoctorLoginDto {
	@NotBlank(message="Username boş bırakılamaz")
	private String username;
	@NotBlank(message="Password boş bırakılamaz")
	private String password;

}
