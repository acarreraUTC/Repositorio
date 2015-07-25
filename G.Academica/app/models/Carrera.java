package models;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

@Entity

public class Carrera extends Model{
    private int codigo;
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL)
	@MapKey(name = "codigo")
	public Map<Long, UnidadAcademica> products;


	public Carrera() {
		this.products = new HashMap<Long, UnidadAcademica>();
	}

	public UnidadAcademica findProduct(int codigo) {
		return null;
	}
    public void addProduct(long codigo, String nombre) {
    	UnidadAcademica product = new UnidadAcademica ();

    	this.products.put(codigo, product);		
    }


}

