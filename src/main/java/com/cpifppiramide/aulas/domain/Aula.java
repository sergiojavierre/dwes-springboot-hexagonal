package com.cpifppiramide.aulas.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula {

    private final String nombre;
    private final List<Sesion> sesiones;

    public Aula(String nombre) {
        this.nombre = nombre;
        this.sesiones = new ArrayList<>(Arrays.asList(new Sesion("Lunes","8:30", "9:20")));
    }

    public String getNombre() {
        return nombre;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }
}
