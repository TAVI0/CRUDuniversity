package com.alkemy.university.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor")
    private Integer idProfessor;

    private Integer dni;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private boolean active;

    /*
    @OneToMany(mappedBy = "professor")
    private List<Subject> subjects;*/
}
