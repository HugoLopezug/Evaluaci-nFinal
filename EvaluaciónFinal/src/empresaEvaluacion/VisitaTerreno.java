package empresaEvaluacion;

public class VisitaTerreno {

	private String identificadorTerreno;
	private String rutCliente;
	private String d�a;
	private String hora;
	private String lugar;
	private String comentario;

	public VisitaTerreno() {
		super();
	}

	public VisitaTerreno(String identificadorTerreno, String rutCliente, String d�a, String hora, String lugar,
			String comentario) {
		super();
		this.identificadorTerreno = identificadorTerreno;
		this.rutCliente = rutCliente;
		this.d�a = d�a;
		this.hora = hora;
		this.lugar = lugar;
		this.comentario = comentario;
	}

	public String getIdentificadorTerreno() {
		return identificadorTerreno;
	}

	public void setIdentificadorTerreno(String identificadorTerreno) {
		this.identificadorTerreno = identificadorTerreno;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getD�a() {
		return d�a;
	}

	public void setD�a(String d�a) {
		this.d�a = d�a;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [identificadorTerreno=" + identificadorTerreno + ", rutCliente=" + rutCliente + ", d�a="
				+ d�a + ", hora=" + hora + ", lugar=" + lugar + ", comentario=" + comentario + "]";
	}

}
