package project.covidex.business.abstracts;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.Result;
import project.covidex.entities.concretes.Patient;

public interface PatientService {
	DataResult<Patient> add(Patient patient);
	public int getTotalCase();
	public int getActiveCase();
	Result getByidentityNumber(String identityNumber);
}
