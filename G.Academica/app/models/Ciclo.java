package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Ciclo extends Model{
    private int codigo;
    private String nivel;

}
