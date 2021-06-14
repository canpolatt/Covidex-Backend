package project.covidex.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.covidex.entities.abstracts.User;


@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="doctors")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","doctorContacts"})
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","doctorContacts"})
public class Doctor extends User{
	
	
	@Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private String doctorIdentity;

    @Column(name="gender")
    private char gender;

    @Column(name="image_url")
    private String imageURL;

    @Column(name="sp_id")
    private int specId;

    @Column(name="birthdate")
    private LocalDate birthDate;
    

}
