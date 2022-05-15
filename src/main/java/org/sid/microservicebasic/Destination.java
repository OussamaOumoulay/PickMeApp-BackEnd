package org.sid.microservicebasic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;
    String Destination;
    int Numseats;
    boolean etat;
}
