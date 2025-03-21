package com.csc340.Assignment4.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animals> getAllAnimals(){

        return animalRepository.findAll();

    }

    public Animals getAnimalById(int animalId){
        return animalRepository.findById(animalId).orElse(null);
    }

    public List<Animals> getAnimalsByDiet(String diet){
        return animalRepository.getAnimalsByDiet(diet);
    }

    public List<Animals> getAnimalsByAnimalsClass(String animalClass){
        return animalRepository.getAnimalsByAnimalClass(animalClass);
    }

    public List<Animals> getAnimalsByName(String name){
        return animalRepository.getAnimalsByName(name);
    }

    public void addNewAnimals(Animals animal){
        animalRepository.save(animal);
    }

    public void updateAnimal(int animalId, Animals animal){
        Animals existing = getAnimalById(animalId);
        existing.setName(animal.getName());
        existing.setDiet(animal.getDiet());
        existing.setAnimalClass(animal.getAnimalClass());
        existing.setDescription(animal.getDescription());
    }

    public void deleteAnimalById(int animalId){
        animalRepository.deleteById(animalId);
    }


}
