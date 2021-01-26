package com.alkemy.university.entity;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "alumn_subject")
public class AlumnSubject {

    @EmbeddedId
    private AlumnSubjectPK id;

    @ManyToOne
    @JoinColumn(name = "id_alumn",insertable = false, updatable = false)
    private Alumn alumn;

    @ManyToOne
    @JoinColumn(name = "id_subject",insertable = false, updatable = false)
    private Subject subject;
}
