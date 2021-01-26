package com.alkemy.university.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

@Entity
@Table(name = "alumn")
public class Alumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumn")
    private Integer idAlumn;

    private Integer dni;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String password;

/*
    @OneToMany(mappedBy = "alumn", cascade = {CascadeType.ALL})
    private List<AlumnSubject> subjects;*/


}
