package com.example.petclinic.Service.map;

import com.example.petclinic.Service.SpecialityService;

import com.example.petclinic.model.Specialiaty;

import java.util.Set;

public class SpecialityServiceMap extends AbstractMapService<Specialiaty, Long> implements SpecialityService {

    @Override
    public Set<Specialiaty> fintAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialiaty object) {
        super.delete(object);
    }

    @Override
    public Specialiaty save(Specialiaty object) {
        return super.save(object);
    }

    @Override
    public Specialiaty findById(Long id) {
        return super.findById(id);
    }
}
