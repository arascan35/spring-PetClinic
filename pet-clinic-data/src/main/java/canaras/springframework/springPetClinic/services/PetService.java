package canaras.springframework.springPetClinic.services;

import canaras.springframework.springPetClinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet findByLastName(String lastName);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
