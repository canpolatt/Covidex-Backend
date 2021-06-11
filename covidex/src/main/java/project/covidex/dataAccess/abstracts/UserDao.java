package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
