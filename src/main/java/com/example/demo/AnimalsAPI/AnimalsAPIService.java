package com.example.demo.AnimalsAPI;

import java.io.IOException;

import org.springframework.stereotype.Service;


@Service
public class AnimalsAPIService {

	private final AnimalsAPIRepository animalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}

	public AnimalsAPI getAnimalById(int id) throws IOException {
	    AnimalsAPI[] animalsList = animalsAPIRepository.getAnimalsAPI();
	    for (AnimalsAPI animal : animalsList) {
	        if (animal.getId() == id) {
	            return animal;
	        }
	    }
	    return null;
	}
}