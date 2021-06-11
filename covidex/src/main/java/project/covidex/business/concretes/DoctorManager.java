package project.covidex.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.DoctorService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.DoctorDao;
import project.covidex.entities.concretes.Doctor;

@Service
public class DoctorManager implements DoctorService {
	private DoctorDao doctorDao;
	
	@Autowired
	public DoctorManager(DoctorDao doctorDao) {
		super();
		this.doctorDao = doctorDao;
	}


	@Override
	public DataResult<Doctor> add(Doctor doctor) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Doctor>(this.doctorDao.save(doctor),"Doktor eklendi!!");
	}


	@Override
	public DataResult<Doctor> getByDoctorId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Doctor>(this.doctorDao.getById(id));
	}

}
