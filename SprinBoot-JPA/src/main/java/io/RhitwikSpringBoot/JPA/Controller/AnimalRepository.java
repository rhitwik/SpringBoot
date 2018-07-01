package io.RhitwikSpringBoot.JPA.Controller;

import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository <Animal, String> {
	
}
