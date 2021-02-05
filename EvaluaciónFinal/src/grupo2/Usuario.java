package grupo2;

public class Usuario implements Asesoria {

	private String nombre;
	private String fechaNacimiento;
	private String rut;

	public Usuario() {

	}

	public Usuario(String nombre, String fechaNacimiento, String rut) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut + "]";
	}

	@Override
	public void analizarUsuario() {

		System.out.println("nombre: " + getNombre());

	}

}
