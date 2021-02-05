package grupo2;

public class Usuario implements Asesoria {

	private String nombre;
	private String fechaNacimiento;
	private String run;

	public Usuario() {

	}

	public Usuario(String nombre, String fechaNacimiento, String run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
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
		return run;
	}

	public void setRut(String run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + run + "]";
	}

	@Override
	public void analizarUsuario() {

		System.out.println("nombre: " + getNombre());

	}

}
