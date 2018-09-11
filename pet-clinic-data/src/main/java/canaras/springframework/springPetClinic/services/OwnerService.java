package canaras.springframework.springPetClinic.services;

import canaras.springframework.springPetClinic.Model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
