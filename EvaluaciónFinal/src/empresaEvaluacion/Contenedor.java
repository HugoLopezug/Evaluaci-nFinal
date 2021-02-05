package empresaEvaluacion;

import java.util.ArrayList;
import java.util.List;

public class Contenedor implements Asesoria {

	
	private List<Asesoria> listaAsesoria;
	private List<Capacitacion> listaCapacitacion;

	
	
	public Contenedor() {
		listaAsesoria = new ArrayList<Asesoria>();
		listaCapacitacion  = new ArrayList<Capacitacion>();
	}

	
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

	public void agregarUsuario(Asesoria usuario) {

		listaAsesoria.add(usuario);

	}

	public void analizarUsuario() {
		for (Asesoria auxUsuario : listaAsesoria) {
			auxUsuario.analizarUsuario();
			System.out.println("");
		}
	}
}
