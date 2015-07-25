package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Universidad extends Model{
    private int codigo;
    private String nombre;

}
