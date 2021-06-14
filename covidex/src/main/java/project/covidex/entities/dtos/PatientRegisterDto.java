package project.covidex.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class PatientRegisterDto {
	@NotBlank(message = "İsim boş bırakılamaz")
	private String firstName;
	@NotBlank(message = "Soyadı boş bırakılamaz")
	private String lastName;
	@NotBlank(message = "TC kimlik boş bırakılamaz")
	private String identityNumber;
	private char gender;
	private LocalDate birthDate;
	private boolean status;
	private String address;
	private String bloodType;
	private String nameOfMother;
	private String nameOfFather;

}
