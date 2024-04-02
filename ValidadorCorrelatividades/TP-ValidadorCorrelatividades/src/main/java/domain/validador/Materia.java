package domain.validador;

import java.util.ArrayList;


public class Materia {
    private String id;
    private String nombre;
    private ArrayList<Materia> materiasCorrelativas;

    public Materia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(ArrayList<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }
}
