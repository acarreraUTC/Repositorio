package models;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity

public class Periodo_Academico extends Model{
    private int codigo;
    private String fecha_inicio;
    private String fecha_final;

}
