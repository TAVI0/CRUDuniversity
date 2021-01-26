package com.alkemy.university.Repository;

import com.alkemy.university.entity.Alumn;

import org.springframework.data.repository.CrudRepository;

public interface AlumnRepository extends CrudRepository<Alumn, Integer> {
    Alumn findByIdAlumn(int idAlumn);
    String findPasswordByIdAlumn(int IdAlumn);


}
