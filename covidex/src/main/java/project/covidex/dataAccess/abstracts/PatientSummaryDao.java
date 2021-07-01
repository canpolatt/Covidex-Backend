package project.covidex.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.covidex.entities.concretes.PatientSummary;

public interface PatientSummaryDao extends JpaRepository<PatientSummary, Integer>{
	
	@Query("from PatientSummary where identityNumber=:identityNumber")
	List<PatientSummary> getByIdentity(String identityNumber);
}
