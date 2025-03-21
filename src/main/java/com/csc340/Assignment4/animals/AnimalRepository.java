package com.csc340.Assignment4.animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Integer>{

    List<Animals> getAnimalsByDiet(String diet);

    List<Animals> getAnimalsByAnimalClass(String animalClass);

    @Query(value = "select * from animals s where s.name like %?1% ", nativeQuery = true)
    List<Animals> getAnimalsByName(String name);


}
