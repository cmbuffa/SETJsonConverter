package py.com.cmbo.clases;

import com.poiji.annotation.ExcelCell;

public class Familiar {
	@ExcelCell(0)
	private String identificacion ; //":"6632769",
	@ExcelCell(1)
    private String nombre ; //":"CARLO TOMAS CENTURION SALOMONI",
	@ExcelCell(2)
    private String regimen ; //":null,
	@ExcelCell(3)
    private String regimenTexto ; //":null,
	@ExcelCell(4)
    private String vinculo ; //":"2",
	@ExcelCell(5)
    private String vinculoTexto ; //":"Hijos",
	@ExcelCell(6)
    private String ruc ; //":"2837213",
	@ExcelCell(7)
    private String periodo ; //":"2018",
	@ExcelCell(8)
    private String fechaNacimiento ;  //":"2010-03-30"
	
    public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRegimen() {
		return regimen;
	}
	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}
	public String getRegimenTexto() {
		return regimenTexto;
	}
	public void setRegimenTexto(String regimenTexto) {
		this.regimenTexto = regimenTexto;
	}
	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	public String getVinculoTexto() {
		return vinculoTexto;
	}
	public void setVinculoTexto(String vinculoTexto) {
		this.vinculoTexto = vinculoTexto;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
