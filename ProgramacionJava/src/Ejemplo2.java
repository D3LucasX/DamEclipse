
public class Ejemplo2 {

	public static void main(String[] args) {
		int n,s = 0;
		int [] notas = {2,1,3,4,2};
		boolean suspensos;
		suspensos=false;
		for (int i = 0; i < 5; i++) {
			n = notas[i];
			if (n < 5) {
				suspensos = true;
				s++;
			}
		}
		if(suspensos) {
			System.out.println("Hay alumnos suspensos " + s);
		}else {
			System.out.println("No hay alumnos suspensos");
		}
	}
}
