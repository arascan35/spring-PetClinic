package canaras.springframework.springPetClinic.services.bootstrap;

import canaras.springframework.springPetClinic.Model.Owner;
import canaras.springframework.springPetClinic.Model.Vet;
import canaras.springframework.springPetClinic.services.OwnerService;
import canaras.springframework.springPetClinic.services.VetService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Can");
        owner1.setLastName("Aras");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Can2");
        owner2.setLastName("Aras");

        ownerService.save(owner2);

        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mia");
        vet1.setLastName("Aras");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Mia2");
        vet2.setLastName("Aras");

        vetService.save(vet2);

    }
}
