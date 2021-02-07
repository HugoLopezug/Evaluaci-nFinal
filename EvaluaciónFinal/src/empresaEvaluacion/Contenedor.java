package empresaEvaluacion;

import java.util.List;

public class Contenedor {

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

	public void setListaCapacitación(List<Capacitacion> listaCapacitacion) {
		this.listaCapacitacion = listaCapacitacion;
	}


	public void analizarUsuario() {

		System.out.println("-------------Lista Usuarios---------------");
		for (Asesoria auxUsuario : listaAsesoria) {
			auxUsuario.analizarUsuario();
			System.out.println("---------------------------------------");
		}
	}
	
	public Asesoria eliminarUsuario(int rut) {

		for (Asesoria usuario : listaAsesoria) {

			if (rut == usuario.darRut())
				return usuario;
		}
		return null;

	}

	public void mostrarUsuariosPorTipo(String nombreClase) {

		System.out.println("-------------------------");
		for (Asesoria usuario : listaAsesoria) {

			if (nombreClase.equals(usuario.getClass().getSimpleName())) {
				usuario.analizarUsuario();
				System.out.println("-------------------------");
			}

		}

	}

	public void mostrarCapacitacion() {
		System.out.println("-------------Lista Capacitaciones---------------");
		for (Capacitacion auxCapacitacion : listaCapacitacion) {
			System.out.println("Identificador: "+ auxCapacitacion.getIdentificador());
			System.out.println("Rut Cliente: "+ auxCapacitacion.getRutCliente());
			System.out.println("Fía: "+ auxCapacitacion.getDia());
			System.out.println("Hora: "+ auxCapacitacion.getHora());
			System.out.println("Lugar: "+ auxCapacitacion.getLugar());
			System.out.println("Duración: "+ auxCapacitacion.getDuracion());
			System.out.println("Cantidad Asistentes: "+ auxCapacitacion.getCantidadAsistentes());
			System.out.println("---------------------------------------------");
		}

	}

}
