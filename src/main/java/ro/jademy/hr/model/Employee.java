package ro.jademy.hr.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employees")
public class Employee {


    @Id
    @Column(name="emp_no")
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="gender")
    private String gender;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
