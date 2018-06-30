package io.RhitwikSpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBAnimalController {

	@Autowired
	private SBAnimalService animalService;

	@RequestMapping("/Animals")
	public List<Animal> getAllAnimals() {
		return animalService.getAllAnimals();
	}

	@RequestMapping("/Animals/{id}")
	public Animal getAnimal(@PathVariable String id) {
		return animalService.getAnimal(id);
	}

}
