package project.covidex.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.covidex.business.abstracts.ExampleService;
import project.covidex.entities.concretes.Example;


@RestController
@RequestMapping("/api/examples")
public class ExampleController {
	private ExampleService exampleService;

	@Autowired
	public ExampleController(ExampleService exampleService) {
		super();
		this.exampleService = exampleService;
	}
	
	@GetMapping("/getall")
	List<Example> getAll(){
		return this.exampleService.getAll();
	}

}
