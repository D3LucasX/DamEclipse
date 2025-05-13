package POO;

public class pruebaConsumo {

	public static void main(String[] args) {
		
		aparatosElectricos bombilla = new aparatosElectricos(0, 0, false);
		aparatosElectricos radiador = new aparatosElectricos(0, 0, false);
		aparatosElectricos plancha = new aparatosElectricos(0, 0, false);
		
		
		System.out.println(aparatosElectricos.consumoTotal());
	}
	

}
