package project.covidex.business.abstracts;

import java.util.List;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.Protocol;


public interface ProtocolService {
	DataResult<Protocol> add(Protocol protocol);
	List<Protocol>  findAllIdentityNumber(String identityNumber);
}
