package empresaEvaluacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

		Contenedor sc2 = new Contenedor(listaAsesoria, listaCapacitacion);
		/*
		 * // Menú
		 * 
		 * 
		 * 
		 * 
		 * // 4 Almacenar Capacitacion Capacitacion capacitacion1 = new
		 * 
		 * 
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
		 * 
		 * // (FALTA) 7 Listar usuario por tipo
		 */

		Integer opcion, rut, run, sistsalud, edad, id, duracionCapacitacion, asistCapacitacion;
		String fechaNacimiento, nombreUsuario, nombresCliente, apellidosCliente, telefono, afp, direccion, comuna,
				titulo, fechaIngreso, area, expPrevia, diaCapacitacion, horaCapacitacion, lugarCapacitacion;
		boolean validadorFecha = false, validadorHora = false;

		Scanner leer = new Scanner(System.in);

		// 1 2 3 Almacenar Cliente, administrativo Profesional

		System.out.println("INVENTARIO DE PERFILES Y CAPACITACIONES MINERA GRUPO 02");
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

			} while (opcion == null);

			switch (opcion) {
				case 1:

					Cliente cliente1 = new Cliente();

					System.out.println("Ingresando perfil de Cliente");
					do {
						System.out.println("Ingrese nombre de usuario");
						nombreUsuario = leer.nextLine();
					} while (nombreUsuario.length() < 10 || nombreUsuario.length() > 30);
					cliente1.setNombre(nombreUsuario);
					do {
						System.out.println("Ingrese fecha de nacimiento de usuario");
						fechaNacimiento = leer.nextLine();
						validadorFecha = validarFecha(fechaNacimiento);
					} while (validadorFecha == false);
					do {
						System.out.println("Ingrese RUN de usuario sin digito verificador	");
						run = validarEnteros();
					} while (run == null || run > 99999999);
					cliente1.setRun(run);
					do {
						System.out.println("Ingrese RUT de cliente sin digito verificador");
						rut = validarEnteros();
					} while (rut == null || rut >= 99999999);
					cliente1.setRut(rut);

					leer.nextLine();
					do {
						System.out.println("Ingrese nombres de cliente");
						nombresCliente = leer.nextLine();
					} while (nombresCliente.length() < 5 || nombresCliente.length() > 30);
					cliente1.setNombre(nombresCliente);
					do {
						System.out.println("Ingrese apellidos de cliente");
						apellidosCliente = leer.nextLine();
					} while (apellidosCliente.length() < 5 || apellidosCliente.length() > 30);
					cliente1.setApellidos(apellidosCliente);
					do {
						System.out.println("Ingrese telefono de cliente ");
						telefono = leer.nextLine();
					} while (telefono.length() != 8 || !telefono.matches("[0-9]*"));
					do {
						System.out.println("Ingrese AFP de cliente");
						afp = leer.nextLine();
					} while (afp.length() < 4 || afp.length() > 30);
					cliente1.setAfp(afp);
					do {
						System.out.println("Ingrese sistema de salud de cliente: 1.- Fonasa 2.- Isapre");
						sistsalud = validarEnteros();
					} while (sistsalud == null || (sistsalud < 1 || sistsalud > 2));
					cliente1.setSalud(sistsalud);
					do {
						System.out.println("Ingrese direccion de cliente");
						direccion = leer.nextLine().strip();
					} while (direccion.length() > 70 || direccion == "");
					cliente1.setDireccion(direccion);
					do {
						System.out.println("Ingrese comuna de cliente");
						comuna = leer.nextLine().strip();
					} while (comuna.length() > 50 || comuna == "");
					cliente1.setComuna(comuna);
					do {
						System.out.println("Ingrese edad de cliente" + "\n");
						edad = validarEnteros();
					} while (edad == null || (edad < 0 || edad > 150));
					cliente1.setEdad(edad);
					listaAsesoria.add(cliente1);
					pausa();

					break;

				case 2:

					Profesional profesional1 = new Profesional();

					System.out.println("Ingresando perfil profesional");
					do {
						System.out.println("Ingrese nombre del profesional");
						nombreUsuario = leer.nextLine();
					} while (nombreUsuario.length() < 10 || nombreUsuario.length() > 30);
					profesional1.setNombre(nombreUsuario);

					do {
						System.out.println("Ingrese fecha de nacimiento del profesional");
						fechaNacimiento = leer.nextLine();
						validadorFecha = validarFecha(fechaNacimiento);
					} while (validadorFecha == false);
					profesional1.setFechaNacimiento(fechaNacimiento);

					do {
						System.out.println("Ingrese RUN del profesional sin digito verificador	");
						run = validarEnteros();
					} while (run == null || run > 99999999);
					profesional1.setRun(run);
					do {
						System.out.println("Ingrese titulo profesional");
						titulo = leer.nextLine();
					} while (titulo.length() < 10 || titulo.length() > 50);
					profesional1.setTitulo(titulo);
					do {
						System.out.println("Ingrese fecha de ingreso");
						fechaIngreso = leer.nextLine();
						validadorFecha = validarFecha(fechaIngreso);
					} while (validadorFecha == false);
					profesional1.setFechaIngreso(fechaIngreso);
					listaAsesoria.add(profesional1);
					pausa();

					break;

				case 3:

					Administrativo administrativo1 = new Administrativo();

					System.out.println("Ingresando administrativo" + "\n");
					do {
						System.out.println("Ingrese nombre del administrativo");
						nombreUsuario = leer.nextLine();
					} while (nombreUsuario.length() < 10 || nombreUsuario.length() > 30);
					administrativo1.setNombre(nombreUsuario);

					do {
						System.out.println("Ingrese fecha de nacimiento del administrativo");
						fechaNacimiento = leer.nextLine();
						validadorFecha = validarFecha(fechaNacimiento);
					} while (validadorFecha == false);
					administrativo1.setFechaNacimiento(fechaNacimiento);

					do {
						System.out.println("Ingrese RUN del administrativo sin digito verificador	");
						run = validarEnteros();
					} while (run == null || run > 99999999);
					administrativo1.setRun(run);
					do {
						System.out.println("Ingrese area");
						area = leer.nextLine().strip();
					} while (area.length() < 5 || area.length() > 100);
					administrativo1.setArea(area);
					do {
						System.out.println("Ingrese experiencia previa");
						expPrevia = leer.nextLine();
					} while (expPrevia.length() > 100);
					administrativo1.setExperienciaPrevia(expPrevia);
					listaAsesoria.add(administrativo1);
					pausa();

					break;

				case 4:

					Capacitacion capacitacion1 = new Capacitacion();
					System.out.println("Ingresando capacitacion" + "\n");
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

				case 6:

					System.out.println("Mostrando usuarios registrados" + "\n");
					sc2.analizarUsuario();

					break;

				case 7:

					System.out.println("Mostrando usuarios registrados" + "\n");
					String elegirUsuario;
					elegirUsuario = leer.nextLine();
					sc2.mostrarUsuariosPorTipo(elegirUsuario);

					break;

				case 8:

					System.out.println("Capacitaciones registradas" + "\n");
					sc2.mostrarCapacitacion();

					break;

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
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
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
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			formatoFecha.parse(fecha);
		} catch (ParseException e) {
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