package domain.Inscripciones;

import domain.Alumnos.Alumno;
import domain.Materias.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InscripcionTest {
        //INSTANCIAMOS CLASES
        Materia aMI = new Materia("Analisis matematico 1");
        Materia aGA = new Materia("Algebra");
        Materia aMII = new Materia("Analisis matematico 2");
        Alumno persona1 = new Alumno("Manuel", 1515015);

    @Test
    @DisplayName("la persona 1 cumple las correlativas, debe aprobar inscripcion")
    public void evaluarInscripcionAprobable(){
        aMII.agregarCorrelativas(aMI, aGA);
        persona1.aprobarMateria(aMI, aGA);

        Inscripcion inscripcion1 = new Inscripcion(persona1);
        inscripcion1.inscribirMateria(aMII);

        Assertions.assertTrue(inscripcion1.aprobada());
    }

    @Test
    @DisplayName("la persona 1 no cumple las correlativas, no debe aprobar inscripcion")
    public void evaluarInscripcionDesaprobable(){
        aMII.agregarCorrelativas(aMI, aGA);
        persona1.aprobarMateria(aMI);

        Inscripcion inscripcion1 = new Inscripcion(persona1);
        inscripcion1.inscribirMateria(aMII);

        Assertions.assertFalse(inscripcion1.aprobada());
    }
}