package com.example.petclinic.Service;

import com.example.petclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet,Long> {
    Pet fintById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
