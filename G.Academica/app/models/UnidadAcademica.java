package models;
import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity

public class UnidadAcademica extends Model{
    private long codigo;
    private String nombre;

    public UnidadAcademica(){
    	this.codigo=codigo;
    	this.nombre=nombre;	
    }
    
    
    public void visualizar(){
    	
    }
   
	public void UnidadAcademica(int Codigo, String nombre) {
		// TODO Auto-generated method stub
		
	}


	public void addProduct(int codigo, String  nombre) {
		// TODO Auto-generated method stub
		
	}

}
