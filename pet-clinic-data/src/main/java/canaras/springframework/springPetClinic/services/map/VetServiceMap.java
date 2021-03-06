package canaras.springframework.springPetClinic.services.map;

import canaras.springframework.springPetClinic.Model.Vet;
import canaras.springframework.springPetClinic.services.CrudService;
import canaras.springframework.springPetClinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class VetServiceMap extends AbstractMapService<Vet,Long>  implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

}
