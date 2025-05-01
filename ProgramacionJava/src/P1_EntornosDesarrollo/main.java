package P1_EntornosDesarrollo;

import java.io.ByteArrayInputStream;

public class main {
	
	public static void main(String[] args) {
		// MI PRIMER OBJETO DE TIPO COCHE QUE C1
		Coche c1 = new Coche("Ford", "Orion", 12);
		System.out.println(c1.toString());
		Coche c2 = new Coche("Porche", "Cayane");
		System.out.println(c2.toString());
	}

}
