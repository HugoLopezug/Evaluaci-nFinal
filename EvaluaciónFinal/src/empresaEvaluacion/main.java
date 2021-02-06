package empresaEvaluacion;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

		Contenedor sc2 = new Contenedor(listaAsesoria, listaCapacitacion);

		// (FALTA) Menú

		// 1, 2, 3 Almacenar Cliente, administrativo Profesional

		Profesional prof1 = new Profesional("Daniel", "18/02/1990", "17257626-5", "Ingeniera ambiental", "14/01/2021");
		listaAsesoria.add(prof1);

		Profesional prof2 = new Profesional("Andres", "13/01/1987", "18789568-7", "Ingeniera agronomo", "11/01/2019");
		listaAsesoria.add(prof2);

		Profesional prof3 = new Profesional("Francisca", "20/08/1992", "18457985-8", "Profesora Ingles", "11/09/2018");
		listaAsesoria.add(prof3);

		Profesional admin1 = new Profesional("Ricardo", "18/02/1984", "14578123-6", "Logistica", "8 años");
		listaAsesoria.add(admin1);

		Administrativo admin2 = new Administrativo("Julio", "14/09/1985", "16547985-9", "Recursos Humnanos", "5 años");
		listaAsesoria.add(admin2);

		// 4 Almacenar Capacitacion
		Capacitacion capacitacion1 = new Capacitacion(22142, "2532647132-2", "16/20/2021", "11:20", "Santiago", 16, 6);
		listaCapacitacion.add(capacitacion1);

		Capacitacion capacitacion2 = new Capacitacion(22143, "16743673-2", "19/01/2021", "16:20", "Santiago", 20, 8);
		listaCapacitacion.add(capacitacion2);

		// 6 Listar USuarios
		sc2.analizarUsuario();
		System.out.println(" ");

		// 8 Listr Capacitaciones
		sc2.mostrarCapacitacion();
		System.out.println("     ");

		System.out.println(sc2.getListaAsesoria().size());
		System.out.println(sc2.getListaCapacitacion().size());
		System.out.println("     ");

		// 5 eliminar Usuario
		listaAsesoria.remove(admin1);
		System.out.println("     ");

		// 6 Listar USuarios
		sc2.analizarUsuario();
		System.out.println(sc2.getListaAsesoria().size());
		System.out.println(sc2.getListaCapacitacion().size());

		// (FALTA) 7 Listar usuario por tipo

	}

}
