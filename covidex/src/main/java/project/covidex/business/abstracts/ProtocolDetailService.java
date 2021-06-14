package project.covidex.business.abstracts;

import project.covidex.core.utilities.results.DataResult;
import project.covidex.entities.concretes.ProtocolDetail;

public interface ProtocolDetailService {
	DataResult<ProtocolDetail> add(ProtocolDetail protocolDetail);

}
