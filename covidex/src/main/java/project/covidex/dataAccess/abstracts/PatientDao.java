package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.concretes.Patient;

public interface PatientDao extends JpaRepository<Patient, Integer> {

}
