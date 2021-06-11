package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.concretes.DoctorContact;

public interface DoctorContactDao extends JpaRepository<DoctorContact, Integer> {

}
