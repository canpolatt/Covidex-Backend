package project.covidex.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.covidex.business.abstracts.ExampleService;
import project.covidex.dataAccess.abstracts.ExampleDao;
import project.covidex.entities.concretes.Example;

@Service
public class ExampleManager implements ExampleService {
	private ExampleDao exampleDao;

	@Autowired
	public ExampleManager(ExampleDao exampleDao) {
		super();
		this.exampleDao = exampleDao;
	}

	@Override
	public List<Example> getAll() {
		// TODO Auto-generated method stub
		return this.exampleDao.findAll();
	}

}
