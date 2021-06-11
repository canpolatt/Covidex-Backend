package project.covidex.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.covidex.entities.concretes.Example;

public interface ExampleDao extends JpaRepository<Example, Integer>{

}
