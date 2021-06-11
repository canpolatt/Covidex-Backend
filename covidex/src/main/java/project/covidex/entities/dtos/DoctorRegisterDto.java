package project.covidex.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class DoctorRegisterDto {
		@NotBlank(message="İsim boş bırakılamaz!!")
	 	private String firstName;
		@NotBlank(message="Soyadı boş bırakılamaz!!")
	    private String lastName;
		@NotBlank(message="TC boş bırakılamaz!!")
	    private String identityNumber;
		@NotBlank(message="Şifre boş bırakılamaz!!")
	    private String password;
	    private char gender;
	    private int specId;
	    private LocalDate birthdate;
}
