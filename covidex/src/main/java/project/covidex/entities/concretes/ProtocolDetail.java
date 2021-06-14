package project.covidex.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="protocol_details")
public class ProtocolDetail {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="protocol_id")
	private int protocolId;
	
	@Column(name="date_of_protocol")
	private LocalDate dateOfProtocol;
	
	@Column(name="details")
	private String detail;
	
	@Column(name="name_of_doctor")
	private String nameOfDoctor;
	
	
	@Column(name="identity_number")
	private String identityNumber;
	
	
	

}
