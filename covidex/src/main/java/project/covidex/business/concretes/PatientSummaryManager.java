package project.covidex.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.PatientSummaryService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.PatientSummaryDao;
import project.covidex.entities.concretes.PatientSummary;


@Service
public class PatientSummaryManager implements PatientSummaryService {
	@Autowired
	private PatientSummaryDao patientSummaryDao;

	@Override
	public DataResult<List<PatientSummary>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<PatientSummary>>(this.patientSummaryDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<List<PatientSummary>> getByIdentity(String userIdentity) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<PatientSummary>>(this.patientSummaryDao.getByIdentity(userIdentity));
	}

}
