package com.alkemy.university.Repository;

import com.alkemy.university.entity.AlumnSubject;
import com.alkemy.university.entity.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository extends CrudRepository<Subject,Integer> {
    List<Subject> findAll();
    Subject findByIdSubject(int idSubject);
    String findDescriptionByIdSubject(int idSubject);
    List<Optional<AlumnSubject>> findAlumnsByIdSubject(int idSubject);
    AlumnSubject save(AlumnSubject alumnSubject);
    Subject save(Subject subject);
    void delete(Subject subject);
}
