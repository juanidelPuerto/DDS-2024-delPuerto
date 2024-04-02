package domain.validador;

import java.util.ArrayList;

public class Alumno {
    private String legajo;
    private String dni;
    private String nombreYApellido;
    private ArrayList<Materia> materiasAprobadas;

    public Alumno(String legajo, String dni, String nombreYApellido) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombreYApellido = nombreYApellido;
        this.materiasAprobadas = new ArrayList<>();
    }

    boolean cumpleCorrelativas(Materia materia ){
        return this.getMateriasAprobadas().containsAll(materia.getMateriasCorrelativas());
    }
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}