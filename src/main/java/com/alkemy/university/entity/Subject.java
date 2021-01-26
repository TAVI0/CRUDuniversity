package com.alkemy.university.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subject")
    private Integer idSubject;

    @ManyToOne
    @JoinColumn(name = "id_professor", insertable = false,updatable = false)
    private Professor professor;

    private String name;
    private String description;
    private Integer quota;
    private String date;

    /*
    @OneToMany(mappedBy = "subject", cascade = {CascadeType.ALL})
    private List<AlumnSubject> alumns;
     */
}
