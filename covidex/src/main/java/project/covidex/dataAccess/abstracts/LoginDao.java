package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.covidex.entities.abstracts.User;

public interface LoginDao extends JpaRepository<User, Integer> {
	User findByuserIdentity(String identityNumber);
	
	@Query("select count(u)>0 from User u where u.userIdentity=:userIdentity")
	boolean ifExistsIdentity(String userIdentity);

}
