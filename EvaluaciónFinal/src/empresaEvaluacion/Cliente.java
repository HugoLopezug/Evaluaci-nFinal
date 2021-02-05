package empresaEvaluacion;

public class Cliente extends Usuario {

	private String rut;
	private String nombres;
	private String apellidos;
	private Integer telefono;
	private String afp;
	private Integer salud;
	private String direccion;
	private String comuna;
	private Integer edad;

	public Cliente() {

	}

	public Cliente(String nombre, String fechaNacimiento, String run, String rut, String nombres, String apellidos,
			Integer telefono, String afp, Integer salud, String direccion, String comuna, Integer edad) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.salud = salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}


	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String obtenerNombre() {
		String nombrecompleto;
		nombrecompleto = nombres + " " + apellidos;
		return nombrecompleto;
	}

	public String obtenerSistemaSalud() {
		String sistema = "";

		if (salud == 1) {
			sistema = "FONASA";
		} else if (salud == 2) {
			sistema = "ISAPRE";
		}
		return sistema;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", salud=" + salud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad="
				+ edad + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección Cliente: " + getDireccion());
		System.out.println("Comuna Cliente: " + getComuna());
	}

}