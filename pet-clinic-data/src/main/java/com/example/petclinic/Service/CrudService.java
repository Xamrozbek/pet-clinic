package com.example.petclinic.Service;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> fintAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
