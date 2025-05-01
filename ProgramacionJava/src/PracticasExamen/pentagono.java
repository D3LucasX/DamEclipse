package PracticasExamen;

public class pentagono {

	public static void main(String[] args) {
		int altura = 3;
		
		pentagono(altura);
	}
	
	public static void pentagono(int altura) {
		for(int i = 0; i < altura; i++){
			for (int j = 0; j < altura -i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i*2+1; k++) {
				if (k == 0|| k == i*2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int base = altura*2;
		for (int i = 0; i <= altura; i++) {
			for (int j = 0; j < base+1; j++) {
				if(j == 0 || j == base || i == altura) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
