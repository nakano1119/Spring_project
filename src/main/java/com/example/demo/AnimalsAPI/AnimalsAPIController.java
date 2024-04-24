package com.example.demo.AnimalsAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimalsAPIController {

	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("searchAPI")
	public String showAnimalForm(Model model) throws IOException {
		List<AnimalsAPI> animals = animalsAPIService.getAllAnimals();
		model.addAttribute("animals", animals);
		return "searchAPI.html";
	}

	@PostMapping("resultAPI")
	public String animal(@RequestParam("id") int id, Model model) throws IOException {
		AnimalsAPI animal = animalsAPIService.getAnimalById(id);
		List<AnimalsAPI> result = new ArrayList<>();
		result.add(animal);
		model.addAttribute("result", result);
		return "resultAPI.html";
	}

}