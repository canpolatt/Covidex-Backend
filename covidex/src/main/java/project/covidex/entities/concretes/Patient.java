package project.covidex.entities.concretes;

import java.time.LocalDate;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="patients")
public class Patient {
	
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
	
	@Column(name="gender")
	private char gender;
	
	@Column(name="birthdate")
	private LocalDate birthDate;
	
	@Column(name="image_url")
	private String imageURL;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="address")
	private String address;
	
	@Column(name="blood_type")
	private String bloodType;
	
	@Column(name="name_of_mother")
	private String nameOfMother;
	
	@Column(name="name_of_father")
	private String nameOfFather;
	
//	@OneToMany(mappedBy = "patient")
//	@JsonIgnore
//	private List<Protocol> protocols;
}
