package grupo2;

import java.util.ArrayList;
import java.util.List;

public class Listado implements Asesoria {

	private List<Asesoria> lista;

	public Listado() {
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

}
