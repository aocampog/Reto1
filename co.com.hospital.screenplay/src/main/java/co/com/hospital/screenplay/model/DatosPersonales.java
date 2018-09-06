package co.com.hospital.screenplay.model;

public class DatosPersonales {
	
	private String registro;
	private String nombreCompleto;
	private String apellidos;
	private String telefono;
	private String tipoDeDocumentoDeIdentidad; 
	private String documentoDeIdentidad;
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipoDeDocumentoDeIdentidad() {
		return tipoDeDocumentoDeIdentidad;
	}
	public void setTipoDeDocumentoDeIdentidad(String tipoDeDocumentoDeIdentidad) {
		this.tipoDeDocumentoDeIdentidad = tipoDeDocumentoDeIdentidad;
	}
	public String getDocumentoDeIdentidad() {
		return documentoDeIdentidad;
	}
	public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
		this.documentoDeIdentidad = documentoDeIdentidad;
	}

	

}
