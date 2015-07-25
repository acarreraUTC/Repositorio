package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Asignatura extends Model{
    private int codigo;
    private String nombre;
    private int creditos;

}
