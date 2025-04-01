package domain.Alumnos;

import domain.Materias.Materia;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Getter
public class Alumno {
    private String nombre;
    private Integer legajo;
    private Set<Materia> materiasAprobadas;

    //REALIZAMOS EL CONSTRUCTOR
    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new HashSet<>();
    }

    //METODOS
    public void aprobarMateria(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean aproboMateria(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }

}
