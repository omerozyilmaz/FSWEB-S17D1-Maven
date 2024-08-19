package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals = new  HashMap<>() ;

    @GetMapping
    public Collection<Animal> getAllAnimals(){
        return animals.values();
    }
    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable Integer id){
        return animals.get(id);
    }
    @PostMapping()
    public Animal createAnimal(@RequestBody Animal newAnimal){
        animals.put(newAnimal.getId(),newAnimal);
        return newAnimal;
    }


    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable Integer id, @RequestBody Animal updateAnimal){
        if (animals.containsKey(id)){
            updateAnimal.setId(id);
            animals.put(id,updateAnimal);
            return updateAnimal;
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public Animal deleteAnimal(@PathVariable Integer id){
        return animals.remove(id);
    }

}
