package project.covidex.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientWithProtocolDto {
	private String firstame;
	private String lastName;
	private String identityNumber;
	private LocalDate birthDate;
	private String nameOfMother;
	private String nameOfFather;
	private String bloodType;
	private String address;
	private char gender;
	private LocalDate dateOfProtocol;
	private String details;
	private String nameOfDoctor;	

}
