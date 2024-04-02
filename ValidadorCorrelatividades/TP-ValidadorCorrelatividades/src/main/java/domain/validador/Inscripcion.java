package domain.validador;

import java.util.ArrayList;



public class Inscripcion {
    private Alumno alumno;
    private ArrayList<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public boolean aprobada() {
        for (Materia m: materias){
            if(!alumno.cumpleCorrelativas(m)){
                return false;
            }
        }
    return true;
    }

    public void agregarMateria(Materia m){
        this.getMaterias().add(m);
    }


    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
}
