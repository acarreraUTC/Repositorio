package controllers;
import play.*;
import models.Docente;
import models.Carrera;
import models.UnidadAcademica;
import play.mvc.*;
import java.util.*;
import models.*;

public class Application extends Controller {

    public static void index() {
    	UnidadAcademica  unidad = inicializar();
        render(unidad);
    }
    
    private static UnidadAcademica inicializar(){
    	Docente docente = new Docente();
    	docente.save();
    	
    	UnidadAcademica unidad= new UnidadAcademica();
    	unidad.addProduct(1,"CIYA");
    	unidad.save();
    	return unidad;
    }
}
