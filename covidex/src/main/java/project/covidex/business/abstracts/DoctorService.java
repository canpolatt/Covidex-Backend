package project.covidex.business.abstracts;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.Doctor;

public interface DoctorService {
	DataResult<Doctor> add(Doctor doctor);
	DataResult<Doctor> getByDoctorId(int id);
}
