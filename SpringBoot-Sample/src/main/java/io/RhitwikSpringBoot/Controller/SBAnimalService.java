package io.RhitwikSpringBoot.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SBAnimalService {

	private List<Animal> animalList = new ArrayList <> (Arrays.asList
			(new Animal("Cat", "Sherie", "Yellow stripe tail"),
			new Animal("Dog", "Dalmi", "Black spot legs"), 
			new Animal("Bird", "Tweet", "Red Blue wings")));

	public List<Animal> getAllAnimals() {
		return animalList;
	}

	public Animal getAnimal(String id) {

		return animalList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

	public void updateAnimal(Animal animal, String id) {
	  animalList.stream().filter(t -> t.getId().equals(id)).findFirst().get().setDesc(animal.getDesc());
	  animalList.stream().filter(t -> t.getId().equals(id)).findFirst().get().setName(animal.getName());
	}
		
}