package py.com.cmbo.clases;

import com.poiji.annotation.ExcelCell;

public class Egreso {

	@ExcelCell(0)
	private String periodo ;
	@ExcelCell(1)
    private String tipo ;
	@ExcelCell(2)
    private String tipoTexto ;
	@ExcelCell(3)
    private String relacionadoTipoIdentificacion ;
	@ExcelCell(4)
    private String fecha ;
	@ExcelCell(5)
    private int id ;
	@ExcelCell(6)
    private String ruc ;
	@ExcelCell(7)
    private int egresoMontoTotal ;
	@ExcelCell(8)
    private String relacionadoNombres ;
	
	@ExcelCell(9)
    private String relacionadoNumeroIdentificacion ;
	@ExcelCell(10)
    private String timbradoCondicion ;
	@ExcelCell(11)
    private String timbradoDocumento ;
	@ExcelCell(12)
    private String timbradoNumero ;
	@ExcelCell(13)
    private String tipoEgreso ;
	@ExcelCell(14)
    private String tipoEgresoTexto ;
	@ExcelCell(15)
    private String subtipoEgreso ;
	@ExcelCell(16)
    private String subtipoEgresoTexto ;
	
    
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRelacionadoTipoIdentificacion() {
		return relacionadoTipoIdentificacion;
	}
	public void setRelacionadoTipoIdentificacion(String relacionadoTipoIdentificacion) {
		this.relacionadoTipoIdentificacion = relacionadoTipoIdentificacion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public int getEgresoMontoTotal() {
		return egresoMontoTotal;
	}
	public void setEgresoMontoTotal(int egresoMontoTotal) {
		this.egresoMontoTotal = egresoMontoTotal;
	}
	public String getRelacionadoNombres() {
		return relacionadoNombres;
	}
	public void setRelacionadoNombres(String relacionadoNombres) {
		this.relacionadoNombres = relacionadoNombres;
	}
	public String getRelacionadoNumeroIdentificacion() {
		return relacionadoNumeroIdentificacion;
	}
	public void setRelacionadoNumeroIdentificacion(String relacionadoNumeroIdentificacion) {
		this.relacionadoNumeroIdentificacion = relacionadoNumeroIdentificacion;
	}
	public String getTimbradoCondicion() {
		return timbradoCondicion;
	}
	public void setTimbradoCondicion(String timbradoCondicion) {
		this.timbradoCondicion = timbradoCondicion;
	}
	public String getTimbradoDocumento() {
		return timbradoDocumento;
	}
	public void setTimbradoDocumento(String timbradoDocumento) {
		this.timbradoDocumento = timbradoDocumento;
	}
	public String getTimbradoNumero() {
		return timbradoNumero;
	}
	public void setTimbradoNumero(String timbradoNumero) {
		this.timbradoNumero = timbradoNumero;
	}
	public String getTipoEgreso() {
		return tipoEgreso;
	}
	public void setTipoEgreso(String tipoEgreso) {
		this.tipoEgreso = tipoEgreso;
	}
	public String getTipoEgresoTexto() {
		return tipoEgresoTexto;
	}
	public void setTipoEgresoTexto(String tipoEgresoTexto) {
		this.tipoEgresoTexto = tipoEgresoTexto;
	}
	public String getTipoTexto() {
		return tipoTexto;
	}
	public void setTipoTexto(String tipoTexto) {
		this.tipoTexto = tipoTexto;
	}
	public String getSubtipoEgreso() {
		return subtipoEgreso;
	}
	public void setSubtipoEgreso(String subtipoEgreso) {
		this.subtipoEgreso = subtipoEgreso;
	}
	public String getSubtipoEgresoTexto() {
		return subtipoEgresoTexto;
	}
	public void setSubtipoEgresoTexto(String subtipoEgresoTexto) {
		this.subtipoEgresoTexto = subtipoEgresoTexto;
	}
}
