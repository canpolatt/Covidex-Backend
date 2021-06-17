package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.covidex.entities.concretes.Patient;

public interface PatientDao extends JpaRepository<Patient, Integer> {

	@Query("select count(*) from Patient")
	public int getTotalCase();
	
	@Query("select count(*) from Patient where status=true")
	public int getActiveCase();
	
}
