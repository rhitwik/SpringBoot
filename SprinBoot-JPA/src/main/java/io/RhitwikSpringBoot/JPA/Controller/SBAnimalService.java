package io.RhitwikSpringBoot.JPA.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SBAnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;

	private List<Animal> animalList = new ArrayList<>(Arrays.asList(new Animal("Cat", "Sherie", "Yellow stripe tail"),
			new Animal("Dog", "Dalmi", "Black spot legs"), new Animal("Bird", "Tweet", "Red Blue wings")));

	public List<Animal> getAllAnimals() {
		List<Animal> animals = new ArrayList<>();
		animalRepository.findAll()
		.forEach(animals::add);
	
		return animals;
	}

	public Animal getAnimal(String id) {
		return animalRepository.findById(id).get();
		
	}

	public void addAnimal(Animal animal) {
		animalRepository.save(animal);
	}

	public void updateAnimal(Animal animal, String id) {
		animalRepository.save(animal);
	}
	
	}