package canaras.springframework.springPetClinic.services;

import canaras.springframework.springPetClinic.Model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}