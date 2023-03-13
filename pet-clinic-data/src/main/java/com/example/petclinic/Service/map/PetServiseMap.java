package com.example.petclinic.Service.map;

import com.example.petclinic.Service.PetService;
import com.example.petclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiseMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> fintAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet fintById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}
