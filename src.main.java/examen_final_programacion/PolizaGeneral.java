package examen_final_programacion;

public final class PolizaGeneral extends PolizaCliente{

	private String codigoDescuento;
	private String numeroDeSeguro;
	
	// Métodos SET y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}
	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}
	public String getNumeroDeSeguro() {
		return numeroDeSeguro;
	}
	public void setNumeroDeSeguro(String numeroDeSeguro) {
		this.numeroDeSeguro = numeroDeSeguro;
	}
}
