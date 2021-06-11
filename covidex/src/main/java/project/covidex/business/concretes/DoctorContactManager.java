package project.covidex.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.DoctorContactService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.DoctorContactDao;
import project.covidex.entities.concretes.DoctorContact;

@Service
public class DoctorContactManager implements DoctorContactService {
	private DoctorContactDao doctorContactDao;
	
	@Autowired
	public DoctorContactManager(DoctorContactDao doctorContactDao) {
		super();
		this.doctorContactDao = doctorContactDao;
	}


	@Override
	public DataResult<DoctorContact> add(DoctorContact doctorContact) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<DoctorContact>(this.doctorContactDao.save(doctorContact),"İletişim bilgileri eklendi!!");
	}

}
