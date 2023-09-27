package com.cpifppiramide.aulas.infrastucture.data;

import com.cpifppiramide.aulas.domain.Aula;
import com.cpifppiramide.aulas.domain.AulasRepository;
import com.cpifppiramide.aulas.domain.Sesion;

import java.util.Arrays;
import java.util.List;

public class AulasRepositoryRAM implements AulasRepository {

    List<Aula> aulas;

    public AulasRepositoryRAM(){
        this.aulas = Arrays.asList(new Aula("730"));
    }

    @Override
    public List<Aula> getAll() {
        return this.aulas;
    }

    @Override
    public List<Sesion> getSesionesFromAula(Aula aula) {
        for (int i = 0; i < this.aulas.size(); i++) {
            Aula aulaActual = this.aulas.get(i);
            if(aulaActual.getNombre().equals(aula.getNombre())){
                return aulaActual.getSesiones();
            }
        }
        return null;
    }
}
