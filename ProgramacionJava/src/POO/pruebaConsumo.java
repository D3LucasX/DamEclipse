package POO;

public class pruebaConsumo {

	public static void main(String[] args) {
		
		aparatosElectricos bombilla = new aparatosElectricos(100, false);
		aparatosElectricos radiador = new aparatosElectricos(2000, false);
		aparatosElectricos plancha = new aparatosElectricos(1200, false);
		
		System.out.println(aparatosElectricos.printConsumoTotal());
		System.out.println(bombilla.setEstado(true));
		System.out.println(bombilla.setEstado(false));
		System.out.println(radiador.setEstado(true));
		System.out.println(radiador.setEstado(true));
		System.out.println(bombilla.setEstado(false));
		System.out.println(radiador.setEstado(false));
		System.out.println(radiador.setEstado(false));
		
	}
	

}
