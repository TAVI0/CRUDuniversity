package com.alkemy.university.Resources.VO;

import com.alkemy.university.entity.Professor;
import lombok.Data;

@Data
public class SubjectVO {
    private Integer idSubject;
    private Professor professor;
    private String name;
    private String description;
    private Integer quota;
    private String date;

}
