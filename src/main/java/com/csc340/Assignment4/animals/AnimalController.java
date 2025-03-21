package com.csc340.Assignment4.animals;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animals")

public class AnimalController {

    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public Object getAllAnimals(){
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
    }

    @GetMapping("/{animalId}")
    public Object getOneAnimal(@PathVariable int animalId){
        return new ResponseEntity<>(service.getAnimalById(animalId), HttpStatus.OK);
    }

    @GetMapping("/name")
    public Object getAnimalByName(@RequestParam(name = "search", defaultValue = " ") String search){
        return new ResponseEntity<>(service.getAnimalsByName(search), HttpStatus.OK);
    }

    @GetMapping("/diet/{diet}")
    public Object getAnimalsByDiet(@PathVariable String diet){
        return new ResponseEntity<>(service.getAnimalsByDiet(diet), HttpStatus.OK);
    }

    @GetMapping("class/{animalClass}")
    public Object getAnimalsByAnimalsClass(@PathVariable String animalClass){
        return new ResponseEntity<>(service.getAnimalsByAnimalsClass(animalClass), HttpStatus.OK);
    }

    @PostMapping("/new")
    public Object addNewAnimal(@RequestBody Animals animal){
        service.addNewAnimals(animal);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.CREATED);
    }

    @PutMapping("/update/{animalId}")
    public Object updateAnimal(@PathVariable int animalId, @RequestBody Animals animal){
        service.updateAnimal(animalId, animal);
        return new ResponseEntity<>(service.getAnimalById(animalId), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{animalId}")
    public Object deleteAnimalById(@PathVariable int animalId){
        service.deleteAnimalById(animalId);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
    }

}
