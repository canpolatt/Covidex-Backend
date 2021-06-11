package project.covidex.business.abstracts;

import project.covidex.core.utilities.results.Result;
import project.covidex.entities.dtos.DoctorLoginDto;

public interface LoginService {
	Result login(DoctorLoginDto doctorLoginDto);

}
