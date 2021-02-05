package grupo2;

public class main {

	public static void main(String[] args) {

		Listado sc = new Listado();
		Profesional prof1 = new Profesional("Daniel", "18/02/1990", "17257626-5", "Ingeniera ambiental", "14/01/2021");
		Profesional prof2 = new Profesional("Andres", "13/01/1987", "18789568-7", "Ingeniera agronomo", "11/01/2019");
		Profesional prof3 = new Profesional("Francisca", "20/08/1992", "18457985-8", "Profesora Ingles", "11/09/2018");
		Profesional admin1 = new Profesional("Ricardo", "18/02/1984", "14578123-6", "Logistica", "8 años");
		Administrativo admin2 = new Administrativo("Julio", "14/09/1985", "16547985-9", "Recursos Humnanos", "5 años");

		sc.agregarUsuario(prof1);
		sc.agregarUsuario(prof2);
		sc.agregarUsuario(prof3);
		sc.agregarUsuario(admin1);
		sc.agregarUsuario(admin2);

		sc.analizarUsuario();

	}

}
