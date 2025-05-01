package PracticasExamen;

import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = rangoNumeros(entrada);
        int rango = numeros.length;
        for(int i = 0; i < rango; i++){
            int number = numeros[i];
            if (isPrime(number)) {
                System.out.println(number + " es un número primo.");
            } else {
                continue;
            }
        }
        System.out.println("¿Desea comprobar otro rango de números? (si/no)");
        String respuesta = entrada.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            main(args); // Llama a la función main nuevamente para reiniciar el programa
        } else {
            System.out.println("Gracias por usar el programa.");
        }
    }

    public static int[] rangoNumeros(Scanner entrada){
        System.out.println("¿Cuantos numeros quiers comprobar?");
        int rangoNum = entrada.nextInt();
        entrada.nextLine();
        int[] numeros = new int[rangoNum];
        for (int i = 0; i < rangoNum; i++) {
            System.out.println("Introduzca el numero " + (i+1));
            numeros[i] = entrada.nextInt();
            entrada.nextLine();
        }
        return numeros;
    }

    public static boolean isPrime(int number) { 
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Comprueba que el número no es divisible por ningún número menor que su raíz cuadrada
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}