package project.covidex.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.covidex.entities.concretes.Patient;
import project.covidex.entities.dtos.PatientWithProtocolDto;

public interface PatientDao extends JpaRepository<Patient, Integer> {

	@Query("select count(*) from Patient")
	public int getTotalCase();
	
	@Query("select count(*) from Patient where status=true")
	public int getActiveCase();
	
	//@Query("from Patient p where p.identityNumber=:identityNumber")
	Patient getByidentityNumber(String identityNumber);	
	
	//@Query("From getAllInformation where=:identityNumber")
	List<PatientWithProtocolDto> getAllInformationByIdentityNumber(String identityNumber);
}


//@Query("Select new project.covidex.entities.dtos.PatientWithProtocolDto"
//		+"(pa.firstName,pa.lastName,pa.identityNumber,pa.birthDate,pa.nameOfMother,pa.nameOfFather,"
//		+ "pa.bloodType,pa.address,pa.gender,pr.dateOfProtocol,pr.details,pr.nameOfDoctor) "
//		+"From Patient pa Inner Join pa.Protocol pr")

