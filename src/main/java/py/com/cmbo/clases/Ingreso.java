package py.com.cmbo.clases;

import com.poiji.annotation.ExcelCell;

public class Ingreso {

	@ExcelCell(0)
	private String tipo;
	@ExcelCell(1)
    private String periodo;
	@ExcelCell(2)
    private String tipoTexto;
	@ExcelCell(3)
    private String ruc;
	@ExcelCell(4)
    private String tipoIngreso;
	@ExcelCell(5)
    private String tipoIngresoTexto;
	@ExcelCell(6)
    private int id;
	@ExcelCell(7)
    private int ingresoMontoGravado ;
	@ExcelCell(8)
    private int ingresoMontoNoGravado ;
	@ExcelCell(9)
    private int ingresoMontoTotal ;
	@ExcelCell(10)
    private String relacionadoTipoIdentificacion ;
	@ExcelCell(11)
    private String mes ;
	@ExcelCell(12)
    private String relacionadoNumeroIdentificacion ;
	@ExcelCell(13)
    private String relacionadoNombres ;
	
    
    
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTipoTexto() {
		return tipoTexto;
	}
	public void setTipoTexto(String tipoTexto) {
		this.tipoTexto = tipoTexto;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTipoIngreso() {
		return tipoIngreso;
	}
	public void setTipoIngreso(String tipoIngreso) {
		this.tipoIngreso = tipoIngreso;
	}
	public String getTipoIngresoTexto() {
		return tipoIngresoTexto;
	}
	public void setTipoIngresoTexto(String tipoIngresoTexto) {
		this.tipoIngresoTexto = tipoIngresoTexto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIngresoMontoGravado() {
		return ingresoMontoGravado;
	}
	public void setIngresoMontoGravado(int ingresoMontoGravado) {
		this.ingresoMontoGravado = ingresoMontoGravado;
	}
	public int getIngresoMontoNoGravado() {
		return ingresoMontoNoGravado;
	}
	public void setIngresoMontoNoGravado(int ingresoMontoNoGravado) {
		this.ingresoMontoNoGravado = ingresoMontoNoGravado;
	}
	public int getIngresoMontoTotal() {
		return ingresoMontoTotal;
	}
	public void setIngresoMontoTotal(int ingresoMontoTotal) {
		this.ingresoMontoTotal = ingresoMontoTotal;
	}
	public String getRelacionadoTipoIdentificacion() {
		return relacionadoTipoIdentificacion;
	}
	public void setRelacionadoTipoIdentificacion(String relacionadoTipoIdentificacion) {
		this.relacionadoTipoIdentificacion = relacionadoTipoIdentificacion;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getRelacionadoNumeroIdentificacion() {
		return relacionadoNumeroIdentificacion;
	}
	public void setRelacionadoNumeroIdentificacion(String relacionadoNumeroIdentificacion) {
		this.relacionadoNumeroIdentificacion = relacionadoNumeroIdentificacion;
	}
	public String getRelacionadoNombres() {
		return relacionadoNombres;
	}
	public void setRelacionadoNombres(String relacionadoNombres) {
		this.relacionadoNombres = relacionadoNombres;
	}
}
