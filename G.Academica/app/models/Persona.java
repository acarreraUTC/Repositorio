package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Persona extends Administrador {
    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private float telefono;

}
