package TallerMecanicoPruebaExamen;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class TallerMecanicoMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Vehiculos> vehiculos = new ArrayList<>();
		ArrayList<Reparaciones> reparaciones = new ArrayList<>();
		ArrayList<Propietarios> usuarios = new ArrayList<>();
		TallerMecanico TallerJose = new TallerMecanico("TallerJose",vehiculos, reparaciones);
	}
	public static Vehiculos darDeAlta(Scanner entrada, ArrayList<Vehiculos> vehiculos) {
		String DecisionCoche;
		boolean esCoche;
		String ultimoRegistro;
		String marca;
		String modelo;
		String color;
		int ano;
		int precioSalida;
		double velocidadMaxima;
		int numeroPuertas;
		String combustible;
		TipoCombustible tipoCombus = null;
		int valido = 0;
		boolean airbag = false;
		String decisionAirbag;
		boolean automatico = false;
		String decisionAutomatico;
		boolean sidecar = false;
		String decisionSidecar;
		boolean deportiva = false;
		String decisionDeportiva;
		int cilindrada = 0;
		Vehiculos nuevoVehiculo = null;
		System.out.println("¿Es un coche?");
		DecisionCoche = entrada.nextLine();
		esCoche = nuevoVehiculo.esCoche(DecisionCoche);
		if (esCoche) {
			if (!vehiculos.isEmpty()) {
				ultimoRegistro = vehiculos.get(vehiculos.size() - 1).getIdRegistro();
				int UltiRegNum= Integer.parseInt(ultimoRegistro) + 1;
				ultimoRegistro = Integer.toString(UltiRegNum);
			}else {
				ultimoRegistro = "1";
			}
			System.out.println("Escribe la marca");
			marca = entrada.nextLine();
			System.out.println("Introduce el modelo.");
			modelo = entrada.nextLine();
			System.out.println("Introduce el color");
			color = entrada.nextLine();
			System.out.println("Introduce el año");
			ano = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Precio de salida?");
			precioSalida = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Velocidad máxima?");
			velocidadMaxima = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("¿Cuantas puertas tiene?");
			numeroPuertas = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Que tipo de combustible consume (DIESEL O GASOLINA)");
			combustible = entrada.nextLine();
			while (valido == 0) {
				if (combustible.toUpperCase().equals("DIESEL")) {
					tipoCombus = TipoCombustible.DIESEL;
					valido = 1;
				}else if (combustible.toUpperCase().equals("GASOLINA")) {
					tipoCombus = TipoCombustible.GASOLINA;
					valido = 1;
				}else{
					System.out.println("Introduzca un daato válido.");
					valido = 0;
				}
			}
			valido = 0;
			System.out.println("¿Tiene AirBag? (is o no)");
			decisionAirbag = entrada.nextLine();
			while (valido == 0) {
				if (decisionAirbag.toLowerCase().equals("si")) {
					airbag = true;
					valido = 1;
				}else if (decisionAirbag.toLowerCase().equals("no")) {
					airbag = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			valido = 0;
			System.out.println("¿Es automático? (is o no)");
			decisionAutomatico = entrada.nextLine();
			while (valido == 0) {
				if (decisionAutomatico.toLowerCase().equals("si")) {
					automatico = true;
					valido = 1;
				}else if (decisionAutomatico.toLowerCase().equals("no")) {
					automatico = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			Coches nuevoCoche = new Coches(ultimoRegistro, marca, modelo, color, ano, precioSalida, velocidadMaxima, numeroPuertas, tipoCombus, airbag, automatico);
			return nuevoCoche;
		}else {
			if (!vehiculos.isEmpty()) {
				ultimoRegistro = vehiculos.get(vehiculos.size() - 1).getIdRegistro();
				int UltiRegNum= Integer.parseInt(ultimoRegistro) + 1;
				ultimoRegistro = Integer.toString(UltiRegNum);
			}else {
				ultimoRegistro = "1";
			}
			System.out.println("Escribe la marca");
			marca = entrada.nextLine();
			System.out.println("Introduce el modelo.");
			modelo = entrada.nextLine();
			System.out.println("Introduce el color");
			color = entrada.nextLine();
			System.out.println("Introduce el año");
			ano = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Precio de salida?");
			precioSalida = entrada.nextInt();
			entrada.nextLine();
			System.out.println("¿Velocidad máxima?");
			velocidadMaxima = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("¿Cilindrada?");
			cilindrada = entrada.nextInt();
			entrada.nextLine();
			valido = 0;
			System.out.println("¿Tiene sidecar? (is o no)");
			decisionSidecar = entrada.nextLine();
			while (valido == 0) {
				if (decisionSidecar.toLowerCase().equals("si")) {
					sidecar = true;
					valido = 1;
				}else if (decisionSidecar.toLowerCase().equals("no")) {
					sidecar = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			valido = 0;
			System.out.println("¿Es deportiva? (is o no)");
			decisionDeportiva = entrada.nextLine();
			while (valido == 0) {
				if (decisionDeportiva.toLowerCase().equals("si")) {
					deportiva = true;
					valido = 1;
				}else if (decisionDeportiva.toLowerCase().equals("no")) {
					deportiva = false;
					valido = 1;
				}else {
					System.out.println("Introduzca una respuesta válida-");
					valido = 0;
				}
			}
			Motos nuevaMoto = new Motos(ultimoRegistro, marca, modelo, color, ano, precioSalida, velocidadMaxima, cilindrada, sidecar, deportiva);
			return nuevaMoto;
		}
	}
	public static Propietarios crearUsuario(Scanner entrada) {
		/*(String dni, String nombre, String cuentaBancaria,
				TallerMecanicoPruebaExamen.TipoSeguro tipoSeguro*/
		String dni;
		String nombre;
		String cuentaBancaria;
		TipoSeguro tipoSeg = null;
		String tipoSeguro;
		int valido = 0;
		System.out.println("----FORMULARIO DE INSCRIPCIÓN------");
		System.out.println("Numero de DNI");
		dni = entrada.nextLine();
		System.out.println("Nombre");
		nombre = entrada.nextLine();
		System.out.println("Numero de cuenta bancaria:");
		cuentaBancaria = entrada.nextLine();
		System.out.println("¿Que tipo de seguro tienes? (TERCEROS O TODO RIESGO)");
		tipoSeguro = entrada.nextLine();
		while (valido == 0) {
			if (tipoSeguro.toUpperCase().equals("TERCEROS")) {
				tipoSeg = TipoSeguro.TERCEROS;
				valido = 1;
			}else if (tipoSeguro.toUpperCase().equals("TODO RIESGO")) {
				tipoSeg = TipoSeguro.TODO_RIESGO;
				valido = 1;
			}else{
				System.out.println("Introduzca un daato válido.");
				valido = 0;
			}
		}
		Propietarios nuevoUsuario = new Propietarios(dni, nombre, cuentaBancaria, tipoSeg);
		return nuevoUsuario;
	}
	public static boolean estaUsuario(String dniPropietario,  ArrayList<Propietarios> usuarios) {
		String dniAbuscar;
		boolean existe = false;
		for (Propietarios usuarioAbuscar : usuarios) {
			dniAbuscar = usuarioAbuscar.getDni();
			if (dniAbuscar.equals(dniPropietario)) {
				existe = true;
			}else {
				existe = false;
			}
		}
		return existe;
	}
	public static void hacerReparacion(Scanner entrada, TallerMecanico TallerJose, ArrayList<Vehiculos> vehiculos, ArrayList<Propietarios> usuarios, ArrayList<Reparaciones> reparaciones ) {
		Vehiculos vehiculoAreparar = null;
		Propietarios propietarioReparacion = null;
		String dniPropietario;
		String idAcomparar;
		String idAbuscar;
		String dniaBuscar;
		String dniAcomparar;
		String comentario;
		String decisionComent;
		boolean estaElVehiculo = false;
		System.out.println("Introduce el dni del usuario");
		dniaBuscar = entrada.nextLine();
		boolean existeElUsuario = estaUsuario(dniaBuscar, usuarios);
		
		if(existeElUsuario) {
			for (Propietarios usuarioReparacion : usuarios) {
				dniAcomparar = usuarioReparacion.getDni();
				if(dniAcomparar.equals(dniaBuscar)) {
					propietarioReparacion = usuarioReparacion;
				}
			}
			System.out.println("Introduzca el id de registro del vehiculo: ");
			idAbuscar = entrada.nextLine();
			estaElVehiculo = TallerJose.estaElVehiculo(idAbuscar);
			if (estaElVehiculo) {
				for(Vehiculos vehiculo : vehiculos) {
					idAcomparar = vehiculo.getIdRegistro();
					if (idAcomparar.equals(idAbuscar)) {
						vehiculoAreparar = vehiculo;
					}
				}
				System.out.println("¿Quieres añadir un comentario? (si o no)");
				decisionComent = entrada.nextLine();
				if (decisionComent.toLowerCase().equals("si")) {
					System.out.println("Agregue el comentario: ");
					comentario = entrada.nextLine();
				}else {
					comentario = null;
				}
				Reparaciones nuevaReparacion = new Reparaciones(vehiculoAreparar, propietarioReparacion, LocalDate.now(),comentario);
				reparaciones.add(nuevaReparacion);
				System.out.println("Reparacion registrada con exito");
			}else {
				System.out.println("Primero debe registrar su vehiculo.");
			}
		}else {
			System.out.println("Primero debe de darse de alta en nuestro sistema.");
		}
	}
}

