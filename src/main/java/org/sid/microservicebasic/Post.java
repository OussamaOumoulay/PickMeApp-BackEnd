package org.sid.microservicebasic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;
    String Fromdestination;
    String Todestination;
    int Numseats;
    boolean etat;
    Long STUDENT_ID;
    String FIRST_name;
    String LAST_name;
    Date date;
}
