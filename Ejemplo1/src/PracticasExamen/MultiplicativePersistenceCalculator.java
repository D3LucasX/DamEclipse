package PracticasExamen;

public class MultiplicativePersistenceCalculator {
	

	public static void main(String[] args) {
		long n = 3227;
		System.out.println("El total de multiplicaciones son: " + persistence(n));
	}
		  // This Method calculates how many times you need to multiply the digits of a number
		  // until you get a single-digit result. 
		  
			public static int persistence(long n) {
		    int contador = 0;
		    while (n >= 10){
		      n = seccionarNumero(n); // n whil be replaced by newNum and if its bigger or equal than 
		                              // 10, it calls the method of seccionarNumero again whith the new numer.
		      contador ++; // Increase the step count
		      }
				return contador; 
			}
		  
		  // Method to multiplicate all the digits and return the new number
		  public static long seccionarNumero(long n){
		    long newNum = 1;
		    while(n > 0){
		      newNum *= n % 10;
		      n /= 10;
		    }
		    return newNum;
		  }
}
