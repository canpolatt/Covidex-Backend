package project.covidex.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.LoginService;
import project.covidex.core.utilities.results.ErrorResult;
import project.covidex.core.utilities.results.Result;
import project.covidex.core.utilities.results.SuccessResult;
import project.covidex.dataAccess.abstracts.LoginDao;
import project.covidex.entities.abstracts.User;
import project.covidex.entities.dtos.DoctorLoginDto;

@Service
public class LoginManager implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public Result login(DoctorLoginDto doctorLoginDto) {
		
		if(!this.loginDao.ifExistsIdentity(doctorLoginDto.getUsername())) {
			return new ErrorResult("Kullanıcı adı hatalı");
		}
		User user=this.loginDao.findByuserIdentity(doctorLoginDto.getUsername());
		if(!user.getPassword().equals(doctorLoginDto.getPassword())) {
			return new ErrorResult("Şifre hatalı");
		}
		
		return new SuccessResult("Başarılı bir şekilde giriş yapıldı");
	}

}
