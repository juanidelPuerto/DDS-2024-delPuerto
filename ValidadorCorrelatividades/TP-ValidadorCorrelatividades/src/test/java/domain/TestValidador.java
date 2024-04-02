package domain;

import domain.validador.Alumno;
import domain.validador.Inscripcion;
import domain.validador.Materia;
import org.junit.Assert;
import org.junit.Test;

public class TestValidador {
    Alumno alumno = new Alumno("9121813", "22222222","Carlos Lopez");

    Inscripcion inscripcion = new Inscripcion(alumno);

    Materia mateSuperior = new Materia("950802", "Matematica Superior");
    Materia am1 = new Materia("950304", "Analisis Matematico");
    Materia am2 = new Materia("950303", "Analisis Matematico 2");
    Materia aga = new Materia("950207", "Algebra y Geometria Analitica");
    Materia aYED = new Materia("082525", "Algoritmos y Estructuras de Datos");
    Materia mateDiscreta = new Materia("081212", "Matematica Discreta");
    @Test
    public void InscripcionNoValida(){
        mateSuperior.getMateriasCorrelativas().add(am1);
        mateSuperior.getMateriasCorrelativas().add(am2);
        mateSuperior.getMateriasCorrelativas().add(aga);

        alumno.getMateriasAprobadas().add(aga);
        alumno.getMateriasAprobadas().add(am1);
        //Como no aprobó am2, al querer anotarse a mate  Superior, deberia ser invalida la inscripcion

        inscripcion.agregarMateria(mateSuperior);
        inscripcion.agregarMateria(aYED);
        inscripcion.agregarMateria(mateDiscreta);

        Assert.assertFalse(inscripcion.aprobada());
    }



    @Test
    public void InscripcionValida(){
        mateSuperior.getMateriasCorrelativas().add(am1);
        mateSuperior.getMateriasCorrelativas().add(am2);
        mateSuperior.getMateriasCorrelativas().add(aga);

        alumno.getMateriasAprobadas().add(aga);
        alumno.getMateriasAprobadas().add(am2); // Ahora sí aprobó am2, entonces puede inscribirse a mate Superior
        alumno.getMateriasAprobadas().add(am1);

        inscripcion.agregarMateria(mateSuperior);
        inscripcion.agregarMateria(aYED);
        inscripcion.agregarMateria(mateDiscreta);

        Assert.assertTrue(inscripcion.aprobada());
    }
}
