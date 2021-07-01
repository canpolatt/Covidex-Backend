package project.covidex.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.ProtocolService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.ProtocolDao;
import project.covidex.entities.concretes.Protocol;


@Service
public class ProtocolManager implements ProtocolService{
	@Autowired
	private ProtocolDao protocolDao;

	@Override
	public DataResult<Protocol> add(Protocol protocol) {
		return new SuccessDataResult<Protocol>(this.protocolDao.save(protocol));
	}

	@Override
	public List <Protocol> findAllIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return this.protocolDao.getByIdentityNumber(identityNumber);
	}

}
