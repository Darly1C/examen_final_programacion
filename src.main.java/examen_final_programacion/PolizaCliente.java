package examen_final_programacion;

public class PolizaCliente {

	private String nombre;
	private String descripcion;
	private int anioVigencia;
	private String codigoPoliza;
	private int valorPoliza;

	// Métodos SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAnioVigencia() {
		return anioVigencia;
	}

	public void setAnioVigencia(int anioVigencia) {
		this.anioVigencia = anioVigencia;
	}

	public String getCodigoPoliza() {
		return codigoPoliza;
	}

	public void setCodigoPoliza(String codigoPoliza) {
		this.codigoPoliza = codigoPoliza;
	}

	public int getValorPoliza() {
		return valorPoliza;
	}

	public void setValorPoliza(int valorPoliza) {
		this.valorPoliza = valorPoliza;
	}
}
