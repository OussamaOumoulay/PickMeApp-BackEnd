package org.sid.microservicebasic;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class MicroServiceBasicApplication implements CommandLineRunner {
    @Autowired
    private UserRepository UserRepository;
    @Autowired
    private DestinationRepository DestinationRepository;
    @Autowired
    private PostRepository PostRepository;


    public static void main(String[] args) {
        SpringApplication.run(MicroServiceBasicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        PostRepository.save(new Post(null,"Casablanca","Agadir",6,false, 6666L,"oussama","oumoulay",new Date()));
        DestinationRepository.save(new Destination(null,"Casablanca",3,false));
        DestinationRepository.save(new Destination(null,"Marrakech",3,false));
        DestinationRepository.save(new Destination(null,"Fez",3,false));
        DestinationRepository.save(new Destination(null,"Salé",3,false));
        DestinationRepository.save(new Destination(null,"Meknes",3,false));
        DestinationRepository.save(new Destination(null,"Rabat",3,false));
        DestinationRepository.save(new Destination(null,"Oujda",3,false));
        DestinationRepository.save(new Destination(null,"Agadir",3,false));
        DestinationRepository.save(new Destination(null,"Kenitra",3,false));
        DestinationRepository.save(new Destination(null,"Tetouan",3,false));
        DestinationRepository.save(new Destination(null,"Temara",3,false));
        DestinationRepository.save(new Destination(null,"El Jadida",3,false));
        UserRepository.save(new User(null, "oussama", "oumoulay","Casa",false,new java.util.Date(),null));
        UserRepository.save(new User(null, "oussama", "oumoulay","Casa",false,new java.util.Date(),null));
        UserRepository.save(new User(null, "oussama", "oumoulay","Casa",false,new java.util.Date(),null));
        UserRepository.save(new User(null, "oussama", "oumoulay","Casa",false,new java.util.Date(),null));

    }
}
