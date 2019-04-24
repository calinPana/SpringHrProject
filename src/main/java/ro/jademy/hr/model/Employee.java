package ro.jademy.hr.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;

    public Employee(int id, String firstName, String lastName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
