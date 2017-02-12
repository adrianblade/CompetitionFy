package user.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Adrian on 12/02/2017.
 */
@Data
@Entity // This tells Hibernate to make a table out of this class
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private int age;
}
