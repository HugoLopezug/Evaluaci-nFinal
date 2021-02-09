package empresaEvaluacion;

import java.util.List;

public class Contenedor{

	private List<Asesoria> listaAsesoria;
	private List<Capacitacion> listaCapacitacion;

	public Contenedor(List<Asesoria> listaAsesoria, List<Capacitacion> listaCapacitacion) {
		super();
		this.listaAsesoria = listaAsesoria;
		this.listaCapacitacion = listaCapacitacion;

	}

	public List<Asesoria> getListaAsesoria() {
		return listaAsesoria;
	}

	public void setListaAsesoria(List<Asesoria> listaAsesoria) {
		this.listaAsesoria = listaAsesoria;
	}

	public List<Capacitacion> getListaCapacitacion() {
		return listaCapacitacion;
	}

	public void setListaCapacitaci�n(List<Capacitacion> listaCapacitacion) {
		this.listaCapacitacion = listaCapacitacion;
	}


	public void analizarUsuario() {

		System.out.println("-------------Lista Usuarios---------------");
		for (Asesoria auxUsuario : listaAsesoria) {
			auxUsuario.analizarUsuario();
			System.out.println("--------------------------------------");
		}
	}
	
	public void mostrarUsuario() {

		System.out.println("-------------Lista Usuarios---------------");
		for (Asesoria auxUsuario2 : listaAsesoria) {
			System.out.println("Nombre: "+ ((Usuario) auxUsuario2).getNombre());
			System.out.println("Run: "+ ((Usuario) auxUsuario2).getRun());
			System.out.println("Fecha de Nacimiento: "+ ((Usuario) auxUsuario2).getFechaNacimiento());
			System.out.println("--------------------------------------");
		}
		System.out.println("   ");
	}
	
	
	public void eleminarUsuario(int run) {
		
		 for (int i = 0; i < listaAsesoria.size(); i++) { 

			 if (run == ((Usuario) listaAsesoria.get(i)).getRun()) {
	                listaAsesoria.remove(i);
	                System.out.println("Usuario fu� encontrado, se eliminar� de la base de datos");
	            } 
			 }  
	    	System.out.println("El Run no fue encontredo");
    }
	
	
	public void mostrarCliente() {
		
		
		System.out.println("-------------Lista Cliente---------------");
		for (Asesoria auxUsuario4 : listaAsesoria) {
			
			if (("Cliente").equals(auxUsuario4.getClass().getSimpleName())){

			System.out.println("Rut:"+ ((Cliente) auxUsuario4).getRut());
			System.out.println("Nombres: "+ ((Cliente) auxUsuario4).getNombres());
			System.out.println("Apellidos: "+ ((Cliente) auxUsuario4).getApellidos());
			System.out.println("Telefono: "+ ((Cliente) auxUsuario4).getTelefono());
			System.out.println("Afp: "+ ((Cliente) auxUsuario4).getAfp());
			System.out.println("Salud: "+ ((Cliente) auxUsuario4).getSalud());
			System.out.println("Direccion: "+ ((Cliente) auxUsuario4).getDireccion());
			System.out.println("Comuna: "+ ((Cliente) auxUsuario4).getComuna());
			System.out.println("Edad: "+ ((Cliente) auxUsuario4).getEdad());
			System.out.println("--------------------------------------");
		}
		}
		System.out.println("   ");
	}	
		
	public void mostrarProfesional() {
		
		System.out.println("-------------Lista Profesional---------------");
		for (Asesoria auxUsuario3 : listaAsesoria) {
			if (("Profesional").equals(auxUsuario3.getClass().getSimpleName())){
			System.out.println("Titulo "+ ((Profesional) auxUsuario3).getTitulo());
			System.out.println("Fecha de Ingreso: "+ ((Profesional) auxUsuario3).getFechaIngreso());
			System.out.println("--------------------------------------");
		}
		}
		System.out.println("   ");
	}
	
	
public void mostrarAdministrativo() {
		
		System.out.println("-------------Lista Administrativo---------------");
		for (Asesoria auxUsuario5 : listaAsesoria) {
			if (("Administrativo").equals(auxUsuario5.getClass().getSimpleName())){
			System.out.println("Area:"+ ((Administrativo) auxUsuario5).getArea());
			System.out.println("Experiencia Previa:"+ ((Administrativo) auxUsuario5).getExperienciaPrevia());
			System.out.println("--------------------------------------");
		}
		
	}
		System.out.println("   ");
}

public Asesoria encontrarCliente() {

	for (Asesoria cliente : listaAsesoria) {
		if (("Cliente").equals(cliente.getClass().getSimpleName())) {

			return cliente;
		}
	}
	return null;
}

public boolean compararRut(int rut) {

	for (int i = 0; i < listaAsesoria.size(); i++) {

		if (rut == ((Cliente) listaAsesoria.get(i)).getRun()) {

			return true;
		}
	}
	return false;

}
	
	
	public void mostrarCapacitacion() {
		System.out.println("-------------Lista Capacitaciones---------------");
		for (Capacitacion auxCapacitacion : listaCapacitacion) {
			System.out.println("Identificador: "+ auxCapacitacion.getIdentificador());
			System.out.println("Rut Cliente: "+ auxCapacitacion.getRutCliente());
			System.out.println("F�a: "+ auxCapacitacion.getDia());
			System.out.println("Hora: "+ auxCapacitacion.getHora());
			System.out.println("Lugar: "+ auxCapacitacion.getLugar());
			System.out.println("Duraci�n: "+ auxCapacitacion.getDuracion());
			System.out.println("Cantidad Asistentes: "+ auxCapacitacion.getCantidadAsistentes());
			System.out.println("---------------------------------------------");
			
		}
		System.out.println("   ");
	}

}
