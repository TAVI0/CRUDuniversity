package com.alkemy.university.Service;

import com.alkemy.university.Repository.ProfessorRepository;
import com.alkemy.university.entity.Professor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }
    @Transactional
    public Professor create(Professor professor){
        return this.professorRepository.save(professor);
    }
    @Transactional
    public Professor update(Professor professor){
        return this.professorRepository.save(professor);
    }
    @Transactional
    public void delete(Professor professor){
        this.professorRepository.delete(professor);
    }
}
