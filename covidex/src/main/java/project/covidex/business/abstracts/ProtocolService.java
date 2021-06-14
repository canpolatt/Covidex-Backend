package project.covidex.business.abstracts;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.Protocol;


public interface ProtocolService {
	DataResult<Protocol> add(Protocol protocol);
}
