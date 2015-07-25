package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Noticia extends Model{
    private int codigo;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String lugar;

    public void añadir(){
    }

    public void eliminar(){
    }

}
