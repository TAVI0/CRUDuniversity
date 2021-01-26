package com.alkemy.university.Service;

import com.alkemy.university.Repository.SubjectRepository;
import com.alkemy.university.entity.AlumnSubject;
import com.alkemy.university.entity.Subject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class SubjectService {
    private final SubjectRepository subjectRepository;
    public SubjectService(SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> findAll(){
        return this.subjectRepository.findAll();
    }

    public Subject findByIdSubject(int idSubject){
        return this.subjectRepository.findByIdSubject(idSubject);
    }

    public String findDescriptionByIdSubject(int idSubject){
        return this.subjectRepository.findDescriptionByIdSubject(idSubject);
    }

    public List<Optional<AlumnSubject>> findAlumnsByIdSubject(int idSubject){
        return this.subjectRepository.findAlumnsByIdSubject(idSubject);
    }

    public AlumnSubject create(AlumnSubject alumnSubject){
        return this.subjectRepository.save(alumnSubject);
    }

    @Transactional
    public Subject create(Subject subject){
        return this.subjectRepository.save(subject);
    }
    @Transactional
    public Subject update(Subject subject){
        return this.subjectRepository.save(subject);
    }
    @Transactional
    public void delete(Subject subject){
        this.subjectRepository.delete(subject);
    }
}
