package project.covidex.business.abstracts;

import java.util.List;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.Result;
import project.covidex.entities.concretes.Patient;
import project.covidex.entities.dtos.PatientWithProtocolDto;

public interface PatientService {
	DataResult<Patient> add(Patient patient);
	public int getTotalCase();
	public int getActiveCase();
	Result getByidentityNumber(String identityNumber);
	DataResult<List<PatientWithProtocolDto>> getAllInformationByIdentityNumber(String identityNumber);
}
