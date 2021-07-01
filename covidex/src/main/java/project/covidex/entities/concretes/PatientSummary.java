package project.covidex.entities.concretes;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "view_patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientSummary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birthdate")
	private LocalDate birthDate;
	
	@Column(name="name_of_mother")
	private String nameOfMother;
	
	@Column(name="name_of_father")
	private String nameOfFather;

	@Column(name="blood_type")
	private String bloodType;

	@Column(name="address")
	private String address;
	
	@Column(name="gender")
	private char gender;
	
	@Column(name="date_of_protocol")
	private LocalDate dateOfProtocol;
	
	@Column(name="details")
	private String detail;
	
	@Column(name="name_of_doctor")
	private String nameOfDoctor;
	


}
