package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.concretes.ProtocolDetail;

public interface ProtocolDetailDao extends JpaRepository<ProtocolDetail, Integer> {

}
