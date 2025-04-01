package domain.Inscripciones;

import domain.Alumnos.Alumno;
import domain.Materias.Materia;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Boolean apruebaInscripcion;
    private Set<Materia> materiasACursar;

    //REALIZAMOS EL CONSTRUCTOR
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasACursar = new HashSet<>();
    }

    //METODOS
    public void inscribirMateria(Materia materia) {
        this.materiasACursar.add(materia);
    }

    public Boolean aprobada() {
        this.apruebaInscripcion =
                this.materiasACursar.stream()
                        .allMatch(materia -> materia.cumpleCorrelativas(this.alumno));
        return this.apruebaInscripcion;
    }
}
