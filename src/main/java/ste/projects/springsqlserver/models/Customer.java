package ste.projects.springsqlserver.models;

import javax.persistence.*;

@Entity
@Table(name="CustomerInfo")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int age;
}
