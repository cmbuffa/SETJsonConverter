package py.com.cmbo.clases;

import java.util.ArrayList;
import java.util.List;

import com.poiji.annotation.ExcelCell;

public class Informante {

	@ExcelCell(0)
	private String ruc ;
	@ExcelCell(1)
    private String dv ;
	@ExcelCell(2)
    private String nombre ;
	@ExcelCell(3)
    private String tipoContribuyente ;
	@ExcelCell(4)
    private String tipoSociedad ;
	@ExcelCell(5)
    private String nombreFantasia ;
	@ExcelCell(6)
    private List<Obligacion> obligaciones ;
	@ExcelCell(7)
    private String clasificacion ;
    
    public Informante()
    {
    	obligaciones = new ArrayList<Obligacion>();
    }
    
	
    public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDv() {
		return dv;
	}
	public void setDv(String dv) {
		this.dv = dv;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoContribuyente() {
		return tipoContribuyente;
	}
	public void setTipoContribuyente(String tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}
	public String getTipoSociedad() {
		return tipoSociedad;
	}
	public void setTipoSociedad(String tipoSociedad) {
		this.tipoSociedad = tipoSociedad;
	}
	public String getNombreFantasia() {
		return nombreFantasia;
	}
	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}
	public List<Obligacion> getObligaciones() {
		return obligaciones;
	}
	public void setObligaciones(List<Obligacion> obligaciones) {
		this.obligaciones = obligaciones;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}


	@Override
	public String toString() {
		return "Informante [ruc=" + ruc + ", dv=" + dv + ", nombre=" + nombre + ", tipoContribuyente="
				+ tipoContribuyente + ", tipoSociedad=" + tipoSociedad + ", nombreFantasia=" + nombreFantasia
				+ ", obligaciones=" + obligaciones + ", clasificacion=" + clasificacion + "]";
	}
	
}
