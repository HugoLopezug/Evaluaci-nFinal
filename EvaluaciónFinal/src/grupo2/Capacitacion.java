package grupo2;

public class Capacitacion {

	
	private int identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private Integer duracion;
	private int cantidadAsistentes;

	public Capacitacion() {
		super();
	}

	public Capacitacion(int cantidadAsistentes, int identificador, String rutCliente, String dia, String hora,
			String lugar, Integer duracion) {
		super();
		this.cantidadAsistentes = cantidadAsistentes;
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
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

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	String mostrarDetalle() {
		String detalle;

		detalle = "La capacitacion sera en " + lugar + " a las " + hora + ", del día " + dia + " y durará "
				+ duracion * 60 + " minutos";

		return detalle;
	}

	@Override
	public String toString() {
		return "Capacitacion [cantidadAsistentes=" + cantidadAsistentes + ", identificador=" + identificador
				+ ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion="
				+ duracion + "]";
	}

}
