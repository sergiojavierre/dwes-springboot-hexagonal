package com.cpifppiramide.aulas.application;

import com.cpifppiramide.aulas.domain.Aula;
import com.cpifppiramide.aulas.domain.AulasRepository;
import com.cpifppiramide.aulas.domain.Sesion;

import java.util.List;

public class AulasUseCases {

    private AulasRepository aulasRepository;

    public AulasUseCases(AulasRepository aulasRepository){
        this.aulasRepository = aulasRepository;
    }

    public List<Aula> getAll(){
        return this.aulasRepository.getAll();
    }

    public List<Sesion> getSesionesFromAula(Aula aula){
        return this.getSesionesFromAula(aula);
    }

}
