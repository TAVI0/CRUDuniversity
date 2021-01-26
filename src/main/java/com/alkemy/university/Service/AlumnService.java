package com.alkemy.university.Service;

import com.alkemy.university.Repository.AlumnRepository;
import com.alkemy.university.entity.Alumn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class AlumnService {
    private final AlumnRepository alumnRepository;
    public AlumnService(AlumnRepository alumnRepository){
        this.alumnRepository = alumnRepository;
    }
    public Optional<Alumn> findById(int idAlumn){
        return this.alumnRepository.findById(idAlumn);
    }


}
