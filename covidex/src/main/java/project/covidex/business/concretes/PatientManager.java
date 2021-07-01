package project.covidex.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.PatientService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.Result;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.PatientDao;
import project.covidex.entities.concretes.Patient;
import project.covidex.entities.dtos.PatientWithProtocolDto;

@Service
public class PatientManager implements PatientService{
	
	@Autowired
	private PatientDao patientDao;

	@Override
	public DataResult<Patient> add(Patient patient) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Patient>(this.patientDao.save(patient),"Hasta eklendi!!!");
	}

	@Override
	public int getTotalCase() {
		// TODO Auto-generated method stub
		return this.patientDao.getTotalCase();
	}

	@Override
	public int getActiveCase() {
		// TODO Auto-generated method stub
		return this.patientDao.getActiveCase();
	}

	@Override
	public DataResult<Patient> getByidentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Patient>(this.patientDao.getByidentityNumber(identityNumber),"Hasta başarıyla getirildi!!");
	}

	@Override
	public DataResult<List<PatientWithProtocolDto>> getAllInformationByIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<PatientWithProtocolDto>>(this.patientDao.getAllInformationByIdentityNumber(identityNumber),"Data listelendi");
	}

}
