package project.covidex.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.ProtocolDetailService;
import project.covidex.core.utilities.results.DataResult;
import project.covidex.core.utilities.results.SuccessDataResult;
import project.covidex.dataAccess.abstracts.ProtocolDetailDao;
import project.covidex.entities.concretes.ProtocolDetail;

@Service
public class ProtocolDetailManager implements ProtocolDetailService {
	@Autowired
	private ProtocolDetailDao protocolDetailDao;

	@Override
	public DataResult<ProtocolDetail> add(ProtocolDetail protocolDetail) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------------------");
		System.out.println(protocolDetail);
		System.out.println("------------------------------------------------------");
		return new SuccessDataResult<ProtocolDetail>(this.protocolDetailDao.save(protocolDetail));
	}

}
