package PracticasExamen;

public class borradoDeVocales {

	public static void main(String[] args) {
		String str = "Borrame todas las vocales";
		System.out.println(disemvowel(str));

	}
	private static String disemvowel(String str) {
	      StringBuilder newCadena = new StringBuilder();
	      int longitud = str.length();
	      for (int i = 0; i < longitud; i++){
	        char c = str.charAt(i);
	        if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'u'){
	          newCadena.append(c);
	        }
	      }
	      return newCadena.toString();
	    }
	}

