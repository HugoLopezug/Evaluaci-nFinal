package empresaEvaluacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

		Contenedor sc2 = new Contenedor(listaAsesoria, listaCapacitacion);
		/*
		 
		 * Capacitacion(22142, "2532647132-2", "16/20/2021", "11:20", "Santiago", 16,
		 * 6); listaCapacitacion.add(capacitacion1);
		 * 
		 * Capacitacion capacitacion2 = new Capacitacion(22143, "16743673-2",
		 * "19/01/2021", "16:20", "Santiago", 20, 8);
		 * listaCapacitacion.add(capacitacion2);
		 * 
		 * // 6 Listar USuarios sc2.analizarUsuario(); System.out.println(" ");
		 * 
		 * // 8 Listr Capacitaciones sc2.mostrarCapacitacion();
		 * System.out.println("     ");
		 * 
		 * System.out.println(sc2.getListaAsesoria().size());
		 * System.out.println(sc2.getListaCapacitacion().size());
		 * System.out.println("     ");
		 * 
		 * // 5 eliminar Usuario listaAsesoria.remove(admin1);
		 * System.out.println("     ");
		 * 
		 * // 6 Listar USuarios sc2.analizarUsuario();
		 * System.out.println(sc2.getListaAsesoria().size());
		 * System.out.println(sc2.getListaCapacitacion().size());
	*/

		Integer opcion, rut, run, sistsalud, edad, id, duracionCapacitacion, asistCapacitacion, telefono;
		String fechaNacimiento, nombreUsuario, nombresCliente, apellidosCliente, afp, direccion, comuna,
				titulo, fechaIngreso, area, expPrevia, diaCapacitacion, horaCapacitacion, lugarCapacitacion;
		boolean validadorFecha = false, validadorHora = false;

		Scanner leer = new Scanner(System.in);

		// MENÚ

		System.out.println("INVENTARIO DE PERFILES Y CAPACITACIONES");
		System.out.println("");
		do {
			do {
				System.out.println("1.- Ingresar Usuario tipo cliente");
				System.out.println("2.- Ingresar Usuario tipo Profesional");
				System.out.println("3.- Ingresar Usuario tipo Administrativo");
				System.out.println("4.- Ingresar Capacitacion");
				System.out.println("5.- Eliminar usuario");
				System.out.println("6.- Listar usuarios ingresados");
				System.out.println("7.- Listar usuarios ingresados por tipo");
				System.out.println("8.- Mostrar capacitaciones ingresadas");
				System.out.println("9.- SALIR");
				opcion = validarEnteros();
				System.out.println("             ");

			// PAra que no de error al ingresar letra
			} while (opcion == null);

			switch (opcion) {
				
				// 1 Almacenar Cliente 
				case 1:

					Cliente cliente1 = new Cliente();
					
					System.out.println("1. Ingresando perfil de Cliente");
					System.out.println("             ");
					// Almacenar Nombre de Usuario
					do {
						System.out.println("Ingrese nombre de usuario (min 10 caracteres, max 50)");
						nombreUsuario = leer.nextLine().strip();
					} while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50);
					cliente1.setNombre(nombreUsuario);
					
					// Almacenar fecha de nacimiento de Usuario
					do {
						System.out.println("Ingrese fecha de nacimiento de usuario (formato dd/mm/aaaa)");
						fechaNacimiento = leer.nextLine();
						validadorFecha = validarFecha(fechaNacimiento);
					} while (validadorFecha == false);
					
					// Almacenar Run Usuario
					do {
						System.out.println("Ingrese RUN de usuario sin digito verificador (hasta 8 digitos)");
						run = validarEnteros();
					} while (run == null || run > 99999999 || run < 999999);
					cliente1.setRun(run);
					
					// Almacenar Rut Cliente
					do {
						System.out.println("Ingrese RUT de cliente sin digito verificador (hasta 8 digitos)");
						rut = validarEnteros();
					} while (rut == null || rut > 99999999 || run < 999999);
					cliente1.setRut(rut);
					
					// Almacenar Nombres Cliente
					leer.nextLine();
					do {
						System.out.println("Ingrese nombres de cliente (min 5 caracteres, max 30)");
						nombresCliente = leer.nextLine().strip();
					} while (nombresCliente.length() < 5 || nombresCliente.length() > 30);
					cliente1.setNombre(nombresCliente);
					
					// Almacenar Apellidos Cliente
					do {
						System.out.println("Ingrese apellidos de cliente (min 5 caracteres, max 30)");
						apellidosCliente = leer.nextLine().strip();
					} while (apellidosCliente.length() < 5 || apellidosCliente.length() > 30);
					cliente1.setApellidos(apellidosCliente);
					
					// Almacenar Telefono Cliente
					do {
						System.out.println("Ingrese telefono de cliente (8 digitos) ");
						telefono = validarEnteros();
					} while (telefono == null || telefono > 100000000 || telefono <9999999 );
					
					// Almacenar AFP Cliente
					do {
						System.out.println("Ingrese AFP de cliente (min 4 caracteres, max 30)");
						afp = leer.nextLine().strip();
					} while (afp.length() < 4 || afp.length() > 30);
					cliente1.setAfp(afp);
					
					// Almacenar Sistema de Salud Cliente
					do {
						System.out.println("Sistema de salud de cliente, Ingrese:");
						System.out.println("1 para Fonasa ");
						System.out.println("2 para Isapre ");
						sistsalud = validarEnteros();
					} while (sistsalud == null || sistsalud < 1 || sistsalud > 2);
					cliente1.setSalud(sistsalud);
					
					// Almacenar Direccion Cliente
					do {
						System.out.println("Ingrese direccion de cliente (maximo 70 caracteres)");
						direccion = leer.nextLine().strip();
					} while (direccion.length() > 70 || direccion == "");
					cliente1.setDireccion(direccion);
					
					// Almacenar Comuna Cliente
					do {
						System.out.println("Ingrese comuna de cliente  (maximo 50 caracteres)");
						comuna = leer.nextLine().strip();
					} while (comuna.length() > 50 || comuna == "");
					cliente1.setComuna(comuna);
					
					// Almacenar Edad Cliente
					do {
						System.out.println("Ingrese edad de cliente (rango de edad 0-150 años)" + "\n");
						edad = validarEnteros();
					} while (edad == null || edad < 0 || edad > 150);
					cliente1.setEdad(edad);
					
					// Almacena Cliente  en Array
					listaAsesoria.add(cliente1);
					
					pausa();

					break;
					
				// Alamacenar Profecional 
				case 2:

					Profesional profesional1 = new Profesional();

					System.out.println("2. Ingresando perfil profesional");
					System.out.println("             ");
					
					// Alamacenar Nombre Usuario
					do {
						System.out.println("Ingrese nombre del Usuario (min 10 caracteres, max 50)");
						nombreUsuario = leer.nextLine().strip();
					} while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50);
					profesional1.setNombre(nombreUsuario);
					
					// Alamacenar Fecha de nacimiento del Usuario
					do {
						System.out.println("Ingrese fecha de nacimiento del Usuario (formato dd/mm/aaaa)");
						fechaNacimiento = leer.nextLine();
						validadorFecha = validarFecha(fechaNacimiento);
					} while (validadorFecha == false);
					profesional1.setFechaNacimiento(fechaNacimiento);
					
					// Almacenar Run Usuario
					do {
						System.out.println("Ingrese RUN de usuario sin digito verificador (hasta 8 digitos)");
						run = validarEnteros();
					} while (run == null || run > 99999999 || run < 999999);
					profesional1.setRun(run);
					
					// Alamacenar Titulo Profeional 
					do {
						System.out.println("Ingrese titulo profesional (min 10 caracteres, max 50)");
						titulo = leer.nextLine().strip();
					} while (titulo.length() < 10 || titulo.length() > 50);
					profesional1.setTitulo(titulo);
					
					// Alamacenar Fecha ingreso Profeional 
					do {
						System.out.println("Ingrese fecha de ingreso (formato (dd/mm/aaaa)");
						fechaIngreso = leer.nextLine();
						validadorFecha = validarFecha(fechaIngreso);
					} while (validadorFecha == false);
					profesional1.setFechaIngreso(fechaIngreso);
					
					// Almacena profesional  en Array
					listaAsesoria.add(profesional1);
					pausa();

					break;
					
				// Almacenar Administrativo
				case 3:

					Administrativo administrativo1 = new Administrativo();

					System.out.println("3. Ingresando administrativo");
					System.out.println("  ");
					
					// Alamacenar Nombre Usuario
					do {
						System.out.println("Ingrese nombre del administrativo (min 10 caracteres, max 50)");
						nombreUsuario = leer.nextLine();
					} while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50);
					administrativo1.setNombre(nombreUsuario);

					// Alamacenar Fecha de nacimiento del Usuario
					do {
						System.out.println("Ingrese fecha de nacimiento del administrativo (formato (dd/mm/aaaa)");
						fechaNacimiento = leer.nextLine();
						validadorFecha = validarFecha(fechaNacimiento);
					} while (validadorFecha == false);
					administrativo1.setFechaNacimiento(fechaNacimiento);

					// Almacenar Run Usuario
					do {
						System.out.println("Ingrese RUN del administrativo sin digito verificador (hasta 8 digitos)");
						run = validarEnteros();
					} while (run == null || run > 99999999 || run < 999999);
					administrativo1.setRun(run);
					
					// Almacenar Area Administrativo
					do {
						System.out.println("Ingrese area de Administrativo (min 5 caracteres, max 20 )");
						area = leer.nextLine().strip();
					} while (area.length() < 5 || area.length() > 100);
					administrativo1.setArea(area);
					
					// Almacenar Experiencia Administrativo
					do {
						System.out.println("Ingrese experiencia previa (maximo 100 caracteres)");
						expPrevia = leer.nextLine().strip();
					} while (expPrevia.length() > 100 );
					administrativo1.setExperienciaPrevia(expPrevia);
					listaAsesoria.add(administrativo1);
					pausa();

					break;
					
				// Almacenar Capacitación 
				case 4:

					Capacitacion capacitacion1 = new Capacitacion();
					
					System.out.println("4. Ingresando capacitacion");
					System.out.println(" ");
					
					do {
						System.out.println("Ingrese identificador (ID) de la capacitacion");
						id = validarEnteros();
					} while (id == null);
					capacitacion1.setIdentificador(id);
					do {
						System.out.println("Ingrese RUT del cliente");
						rut = validarEnteros();
					} while (rut == null || rut > 99999999);
					capacitacion1.setRutCliente(rut);
					do {
						System.out.println("Ingrese dia que se realizará la capacitacion");
						diaCapacitacion = leer.nextLine().toLowerCase();
					} while (!diaCapacitacion.equals("lunes") && !diaCapacitacion.equals("martes")
							&& !diaCapacitacion.equals("miercoles") && !diaCapacitacion.equals("jueves")
							&& !diaCapacitacion.equals("viernes") && !diaCapacitacion.equals("sabado")
							&& !diaCapacitacion.equals("domingo"));
					capacitacion1.setDia(diaCapacitacion);
					do {
						System.out.println("Ingrese hora que se realizará la capacitacion");
						horaCapacitacion = leer.nextLine();
						validadorHora = validarHora(horaCapacitacion);
					} while (validadorHora == false);
					capacitacion1.setHora(horaCapacitacion);
					do {
						System.out.println("Ingrese lugar de la capacitacion");
						lugarCapacitacion = leer.nextLine();
					} while (lugarCapacitacion.length() < 10 || lugarCapacitacion.length() > 50);
					capacitacion1.setLugar(lugarCapacitacion);
					do {
						System.out.println("Ingrese duracion de horas de la capacitacion");
						duracionCapacitacion = validarEnteros();
					} while (duracionCapacitacion == null);
					capacitacion1.setDuracion(duracionCapacitacion);
					do {
						System.out.println("Ingrese la cantidad de participantes");
						asistCapacitacion = validarEnteros();
					} while (asistCapacitacion == null || (asistCapacitacion < 0 || asistCapacitacion > 1000));
					capacitacion1.setCantidadAsistentes(asistCapacitacion);
					listaCapacitacion.add(capacitacion1);

					break;
					
				// Eliminar Usuario
				case 5:

					System.out.println("Eliminando usuario" + "\n");
					do {
						System.out.println(
								"Ingrese el rut del usuario registrado que desea eliminar de la base de datos");
						rut = validarEnteros();
					} while (rut == null);
					Asesoria eliminando = sc2.eliminarUsuario(rut);
					listaAsesoria.remove(eliminando);

					break;
					
				// Lisar Usuarios 
				case 6:

					System.out.println("Mostrando usuarios registrados" + "\n");
					sc2.analizarUsuario();

					break;
				// Listar Usuario por tipo 
				case 7:

					System.out.println("Mostrando usuarios registrados" + "\n");
					String elegirUsuario;
					elegirUsuario = leer.nextLine();
					sc2.mostrarUsuariosPorTipo(elegirUsuario);

					break;
					
				// Listar Capacitaciones 
				case 8:

					System.out.println("Capacitaciones registradas" + "\n");
					sc2.mostrarCapacitacion();

					break;
					
				// Salir
				case 9:

					System.out.println("Cerrando base de datos" + "\n");
					System.out.println("Hasta la proxima");

					break;

				default:

					System.out.println("Opcion incorrecta, intentelo nuevamente" + "\n");
					pausa();

					break;
			}
		} while (opcion != 9);

	}

	/**
	 * metodo que añade una pausa a la ejecucion de la consola
	 * 
	 */

	public static void pausa() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	/**
	 * Metodo que valida la entrada solo de enteros, evitando error de consola
	 * 
	 * @return num
	 */

	public static Integer validarEnteros() {
		Integer num;
		try {
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
		} catch (Exception e) {
			num = null;
		}
		return num;
	}

	/**
	 * metodo que valida un string como formato de fecha (dd/mm/aaaa)
	 * 
	 * 
	 * @param fecha
	 * @return boolean
	 */

	public static boolean validarFecha(String fecha) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate.parse(fecha, formatter);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean validarHora(String hora) {
		try {

			LocalTime.parse(hora);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/*
	 * Creamos la hora con formato del api Java SimpleDateFormat sdf = new
	 * SimpleDateFormat("HH:mm:ss"); Date date = sdf.parse(myDateString);
	 */

}