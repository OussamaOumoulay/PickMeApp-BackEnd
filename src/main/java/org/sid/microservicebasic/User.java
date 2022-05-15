package org.sid.microservicebasic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long STUDENT_ID;
    String FIRST_name;
    String LAST_name;
    String Destination;
    boolean etat;
    Date date;
    String status;
}
