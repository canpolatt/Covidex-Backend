package project.covidex.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.PatientService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.PatientDao;
import project.covidex.entities.concretes.Patient;

@Service
public class PatientManager implements PatientService{
	
	@Autowired
	private PatientDao patientDao;

	@Override
	public DataResult<Patient> add(Patient patient) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Patient>(this.patientDao.save(patient),"Hasta eklendi!!!");
	}

}
