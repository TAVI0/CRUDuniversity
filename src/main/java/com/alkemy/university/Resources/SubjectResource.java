package com.alkemy.university.Resources;

import com.alkemy.university.Service.SubjectService;
import com.alkemy.university.Resources.VO.SubjectVO;
import com.alkemy.university.entity.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SubjectResource {
    private final SubjectService subjectService;

    public SubjectResource(SubjectService subjectService){
        this.subjectService = subjectService;
    }

    @GetMapping("/subjects")
    public ResponseEntity<List<Subject>> findAllSubjects(){
        return ResponseEntity.ok(this.subjectService.findAll());
    }


    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody SubjectVO subjectVO){
        Subject subject = new Subject();
        subject.setProfessor(subjectVO.getProfessor());
        subject.setName(subjectVO.getName());
        subject.setDescription(subjectVO.getDescription());
        subject.setQuota(subjectVO.getQuota());
        subject.setDate(subjectVO.getDate());
        return new ResponseEntity<>(this.subjectService.create(subject), HttpStatus.CREATED);
    }

    @PutMapping("/{idSubject}")
    public ResponseEntity<Subject> updateSubject(@PathVariable("idSubject") int idSubject, SubjectVO subjectVO){
        Subject subject = this.subjectService.findByIdSubject(idSubject);
        if(subject==null){
            return new ResponseEntity<Subject>(HttpStatus.NOT_FOUND);
        } else {
            subject.setProfessor(subjectVO.getProfessor());
            subject.setName(subjectVO.getName());
            subject.setDescription(subjectVO.getDescription());
            subject.setQuota(subjectVO.getQuota());
            subject.setDate(subjectVO.getDate());
        }
        return new ResponseEntity<>(this.subjectService.update(subject), HttpStatus.OK  );
    }

    @DeleteMapping("/{idSubject}")
    public void removeSubject(@PathVariable("idSubject") int idSubject){
        Subject subject = this.subjectService.findByIdSubject(idSubject);
        if(subject != null) {
            this.subjectService.delete(subject);
        }
    }
}
