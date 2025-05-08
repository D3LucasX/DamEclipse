package Recursividad;

public class esBinario {

	public static void main(String[] args) {
		int n = 11001;
		String numeroCadena = Integer.toString(n);
		boolean SiNo = esBinario(n);
		if(SiNo == true) {
			System.out.println("El número introducido es binario");
		}else {
			System.out.println("El número introducido no es binario");
		}

	}
	/*public static boolean esBinario(int n) {
		String numeroCadena = Integer.toString(n);
		boolean esCeroUno = false;
		for (int i = 0; i < numeroCadena.length(); i++) {
			char c = numeroCadena.charAt(i);
			if(numeroCadena.charAt(i) == '0' ||numeroCadena.charAt(i) == '1') {
				esCeroUno = true;
			}else {
				return false;
			}
		}
		return true;
		}*/
	public static boolean esBinario(int n) {
        // Caso base: si el número es 0 o 1, comprobamos el último número
        if (n == 0 || n == 1) {
            return true;
        }
        int ultimoDigito = n % 10;
        if (ultimoDigito != 0 && ultimoDigito != 1) {
            return false;
        }
        return esBinario(n / 10); // Llamada recursiva quitandole el último dígito
    }
	}

