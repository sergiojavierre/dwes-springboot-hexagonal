package com.cpifppiramide.aulas.domain;

import java.util.List;

public interface AulasRepository {

    public List<Aula> getAll();
    public List<Sesion> getSesionesFromAula(Aula aula);
}
