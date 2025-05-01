package PracticasExamen;

public class EjemplosMetodosCadenas {

	public static void main(String[] args) {
		String cadena = "Hola que tal estas";
		String a = "a";
		String p = "p";
		int longitud = cadena.length(); // Devuelve la longitud de la cadena
		char posicion = cadena.charAt(5); // Devuielve el caracter que se encuentra en la posicion 5
		String minuscula = cadena.toLowerCase(); // Devuelve la cadena toda en minúsculas
		String mayuscula = cadena.toUpperCase(); // Devuelve toda la cadena en mayúsculas
		String subcadena = cadena.substring(0, 3); // devuelve una cadena desde la posicion x hasta la posicion y
		String reemplazo = cadena.replace(a,p); // Cambia todas las a' por p'.
		String noEspacios = cadena.trim(); // Devuelve una cadena sin espacios iniciales ni finales.
		boolean start = cadena.startsWith(subcadena); // Indica si la cadena empieza por una subcadena.
		boolean end = cadena.endsWith(subcadena); // Indica si la cadena termina por una subcadena.
		System.out.println("Longitud = " + longitud);
		System.out.println("posicion = " + posicion);
		System.out.println("Minusculas = " + minuscula);
		System.out.println("Mayúsculas = " + mayuscula);
		System.out.println("Subcadena = " + subcadena);
		System.out.println("Char Reemplazado = " + reemplazo);
		System.out.println("String sin espacios iniciales ni finales = " + noEspacios);
		System.out.println("Empieza por = " + start);
		System.out.println("Termina por = " + end);
		
		//Funciones mas avanzadas.
		int posicionSubCadena = cadena.indexOf(subcadena, 0); // Indica la posicion inicial de cierta subcadena desde la posicion quqe le pongas iniciando la busqueda desde el inicio
		System.out.println("Posicion sub cadena = " + posicionSubCadena);
		
		int posicionSubCadenafin = cadena.lastIndexOf("que", longitud-1); // Indica la posicion inicial de cierta subcadena desde la posicion quqe le pongas iniciando la busqueda desde el final.
		System.out.println("Posicion sub cadena final = " + posicionSubCadenafin);
		
		String texto = "Cambiamos de int a texto: " + String.valueOf(longitud); // Cambia casi cualquier tipo de dato a un String 
		System.out.println(texto);
		
		String ConcatenarCadenas = "Cadena concatenada: " + cadena.concat(" " + subcadena);
		System.out.println(ConcatenarCadenas);
		
		boolean iguales = cadena.equals(subcadena); // Devuelve true o false
		System.out.println("Son iguales la cadena y la subcadena?: " + iguales);
		
		boolean iguales2 = cadena.equalsIgnoreCase(subcadena); // Devuelve true o false ignorando si son mayusculas o minusculas
		System.out.println("Son iguales la cadena y la subcadena ignorando si son mayus o minus?: " + iguales2);
		
		int iguales3 = cadena.compareTo(subcadena);
		System.out.println("Son iguales devolviendo 0 si lo son, y -1 si la cadena es menor que la subcadena y positivo si la cadena es mayor: " + iguales3);
		// Este ejemplo devuelve 15, ya que la longitud total es 18 - 3(número de caracteres de la subcadena) = 15
		
		
		
		
	}

}
