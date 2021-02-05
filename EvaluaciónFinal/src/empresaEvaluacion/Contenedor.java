package empresaEvaluacion;

import java.util.ArrayList;
import java.util.List;

public class Contenedor implements Asesoria {

	private List<Asesoria> lista;

	public Contenedor() {
		lista = new ArrayList<Asesoria>();
	}

	public void agregarUsuario(Asesoria usuario) {

		lista.add(usuario);

	}

	public void analizarUsuario() {
		for (Asesoria auxUsuario : lista) {
			auxUsuario.analizarUsuario();
			System.out.println("");
		}
	}
 // C
}
