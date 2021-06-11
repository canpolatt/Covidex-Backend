package project.covidex.business.abstracts;

import java.util.List;

import project.covidex.entities.concretes.Example;

public interface ExampleService {
	List<Example> getAll();
}
