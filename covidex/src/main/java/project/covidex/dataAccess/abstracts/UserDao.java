package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.abstracts.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer>{
    User findByUserIdentity(String userIdentity);
    List<User> getById(int id);
}
