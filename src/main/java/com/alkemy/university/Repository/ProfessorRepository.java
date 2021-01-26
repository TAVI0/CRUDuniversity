package com.alkemy.university.Repository;

import com.alkemy.university.entity.Professor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProfessorRepository extends CrudRepository <Professor, Integer> {
    List<Professor> findAll();
    Optional<Professor> findByIdProfessor(int idProfessor);

    Professor save(Professor professor);
    void delete(Professor professor);

}
