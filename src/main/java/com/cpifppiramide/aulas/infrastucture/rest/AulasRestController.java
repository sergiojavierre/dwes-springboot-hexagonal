package com.cpifppiramide.aulas.infrastucture.rest;

import com.cpifppiramide.aulas.application.AulasUseCases;
import com.cpifppiramide.aulas.domain.Aula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AulasRestController {

    AulasUseCases aulasUseCases;

    public AulasRestController(){
        this.aulasUseCases = new AulasUseCases(new AulasRepositorySQL());
    }

    @GetMapping("/")
    List<Aula> getAll(){
        return this.aulasUseCases.getAll();
    }

}
