package com.cpifppiramide.aulas.infrastucture.web;

import com.cpifppiramide.aulas.application.AulasUseCases;
import com.cpifppiramide.aulas.domain.Aula;
import com.cpifppiramide.aulas.infrastucture.data.AulasRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AulasController {

    AulasUseCases aulasUseCases;

    public AulasController(){
        this.aulasUseCases = new AulasUseCases(new AulasRepositoryRAM());
    }

    @GetMapping("/")
    public String getAll(Model model){
        List<Aula> aulas = this.aulasUseCases.getAll();
        model.addAttribute("aulas", aulas);
        return "aulas";
    }

}
