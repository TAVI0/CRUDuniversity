package com.alkemy.university.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data

@Embeddable
public class AlumnSubjectPK implements Serializable {

    @Column(name = "id_alumn")
    private Integer idAlumn;

    @Column(name = "id_subject")
    private Integer idSubject;
}
