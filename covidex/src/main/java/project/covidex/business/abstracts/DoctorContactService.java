package project.covidex.business.abstracts;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.DoctorContact;

public interface DoctorContactService {
	DataResult<DoctorContact> add(DoctorContact doctorContact);
}
