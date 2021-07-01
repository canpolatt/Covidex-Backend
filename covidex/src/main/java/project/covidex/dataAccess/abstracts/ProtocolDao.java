package project.covidex.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import project.covidex.entities.concretes.Protocol;

public interface ProtocolDao extends JpaRepository<Protocol, Integer> {
	List<Protocol> getByIdentityNumber(String identityNumber);

}
