package domain.Materias;

import domain.Alumnos.Alumno;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    //REALIZAMOS EL CONSTRUCTOR
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
    }

    //METODOS
    public boolean cumpleCorrelativas(Alumno alumno) {
        return this.correlativas.stream().allMatch( materia -> alumno.aproboMateria(materia));
    }

    public void agregarCorrelativas(Materia ... materias) {
        Collections.addAll(this.correlativas, materias);
    }
}
