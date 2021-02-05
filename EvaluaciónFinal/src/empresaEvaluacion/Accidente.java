package empresaEvaluacion;

public class Accidente {

	private String identificador;
	private String rutCliente;
	private String díaSemana;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencia;

	public Accidente() {
		super();
	}

	public Accidente(String identificador, String rutCliente, String díaSemana, String hora, String lugar,
			String origen, String consecuencia) {
		super();
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.díaSemana = díaSemana;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencia = consecuencia;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDíaSemana() {
		return díaSemana;
	}

	public void setDíaSemana(String díaSemana) {
		this.díaSemana = díaSemana;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencia() {
		return consecuencia;
	}

	public void setConsecuencia(String consecuencia) {
		this.consecuencia = consecuencia;
	}

	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", díaSemana=" + díaSemana
				+ ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencia=" + consecuencia + "]";
	}

}
