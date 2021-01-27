package com.alkemy.university.Resources;

import com.alkemy.university.Service.AlumnService;
import com.alkemy.university.entity.Alumn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping
public class AlumnResource {
    private final AlumnService alumnService;
    public AlumnResource(AlumnService alumnService){
        this.alumnService = alumnService;
    }

    @GetMapping("/alumn/{idAlumn}")
    public ResponseEntity<Optional<Alumn>> findById(@PathVariable("idAlumn")int idAlumn){
        return ResponseEntity.ok(this.alumnService.findById(idAlumn));
    }
}
