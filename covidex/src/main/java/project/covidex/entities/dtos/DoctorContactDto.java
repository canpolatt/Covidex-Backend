package project.covidex.entities.dtos;


import lombok.Data;

@Data
public class DoctorContactDto {
	private int doctorId;
	private String phone;
	private String email;
	private String address;
}
