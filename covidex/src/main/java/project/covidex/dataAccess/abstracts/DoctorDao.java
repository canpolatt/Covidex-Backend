package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.concretes.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
	Doctor getById(int id);
	Doctor getBydoctorIdentity(String username);
}
