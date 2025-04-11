package com.csc340.Assignment4.animals;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/animals")

public class AnimalController {

    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public Object getAllAnimals(Model model){
        //return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
        model.addAttribute("animalList", service.getAllAnimals());
        model.addAttribute("title", "All Animals");
        return "animal-list";

    }

    @GetMapping("/{animalId}")
    public Object getOneAnimal(@PathVariable int animalId, Model model){
        //return new ResponseEntity<>(service.getAnimalById(animalId), HttpStatus.OK);
        model.addAttribute("animal", service.getAnimalById(animalId));
        model.addAttribute("title", "Animal #:" + animalId);
        return "animal-details";
    }

    @GetMapping("/name")
    public Object getAnimalByName(@RequestParam(name = "search", defaultValue = " ") String search){
        return new ResponseEntity<>(service.getAnimalsByName(search), HttpStatus.OK);
    }

    @GetMapping("/diet/{diet}")
    public Object getAnimalsByDiet(@PathVariable String diet, Model model){
        //return new ResponseEntity<>(service.getAnimalsByDiet(diet), HttpStatus.OK);
        model.addAttribute("animalList", service.getAnimalsByDiet(diet));
        model.addAttribute("title", "Animals By Diet" + diet);
        return "animal-list";
    }

    @GetMapping("class/{animalClass}")
    public Object getAnimalsByAnimalsClass(@PathVariable String animalClass){
        return new ResponseEntity<>(service.getAnimalsByAnimalsClass(animalClass), HttpStatus.OK);
    }

    @GetMapping("/createForm")
    public String showCreateForm(Model model){
        Animals animals = new Animals();
        model.addAttribute("animal", animals);
        model.addAttribute("title", "Create New Animal");
        return "animal-create";
    }

    @PostMapping("/new")
    public Object addNewAnimal(Animals animals, Model model){
        service.addNewAnimals(animals);
        //return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.CREATED);
        return "redirect:/animals/all";
    }

    @GetMapping("/update/{animalId}")
    public String showUpdateForm(@PathVariable int animalId, Model model){
        model.addAttribute("animal", service.getAnimalById(animalId));
        model.addAttribute("title", "Update Animal");
        return "animal-update";
    }

    @PostMapping("/update/{animalId}")
    public Object updateAnimal(@PathVariable int animalId, Animals animal){
        service.updateAnimal(animalId, animal);
        //return new ResponseEntity<>(service.getAnimalById(animalId), HttpStatus.CREATED);
        return "redirect:/animals/" + animalId;
    }

    @GetMapping("/delete/{animalId}")
    public Object deleteAnimalById(@PathVariable int animalId){
        service.deleteAnimalById(animalId);
        //return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
        return "redirect:/animals/all";
    }

}
