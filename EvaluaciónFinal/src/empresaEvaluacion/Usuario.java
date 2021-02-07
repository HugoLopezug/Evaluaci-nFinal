package empresaEvaluacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario implements Asesoria {

	private String nombre;
	private String fechaNacimiento;
	private Integer run;

	public Usuario() {

	}

	public Usuario(String nombre, String fechaNacimiento, Integer run) {
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

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + run + "]";
	}

	public void mostrarEdad() {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("El Usuario tiene %s años", periodo.getYears() /* periodo.getMonths(), periodo.getDays() */);

	}

	@Override
	public void analizarUsuario() {

		System.out.println("Nombre: " + getNombre());
		System.out.println("Run: " + getRun());
	}
	
	
	@Override
	public int darRut() {
		return getRun();
		
	}

}
