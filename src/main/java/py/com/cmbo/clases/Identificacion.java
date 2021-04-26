package py.com.cmbo.clases;

import com.poiji.annotation.ExcelCell;

public class Identificacion {
	@ExcelCell(0)
	private String periodo ;

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
