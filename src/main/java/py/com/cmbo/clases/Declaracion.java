package py.com.cmbo.clases;

import java.util.ArrayList;
import java.util.List;

public class Declaracion {

	private Informante informante ;
    private Identificacion identificacion ;
    private List<Ingreso> ingresos ;
    private List<Egreso> egresos ;
    private List<Familiar> familiares ;
    
    
    public Declaracion()
    {
    	informante = new Informante();
    	identificacion = new Identificacion();
    	ingresos = new ArrayList<Ingreso>();
    	egresos = new ArrayList<Egreso>();
    	familiares = new ArrayList<Familiar>();
    }
    
	public Informante getInformante() {
		return informante;
	}
	public void setInformante(Informante informante) {
		this.informante = informante;
	}
	public Identificacion getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(Identificacion identificacion) {
		this.identificacion = identificacion;
	}
	public List<Ingreso> getIngresos() {
		return ingresos;
	}
	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	public List<Egreso> getEgresos() {
		return egresos;
	}
	public void setEgresos(List<Egreso> egresos) {
		this.egresos = egresos;
	}
	public List<Familiar> getFamiliares() {
		return familiares;
	}
	public void setFamiliares(List<Familiar> familiares) {
		this.familiares = familiares;
	}   
}
