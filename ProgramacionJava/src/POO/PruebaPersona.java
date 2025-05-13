package POO;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(55,1.80, 175, false, "aguda");
		
		System.out.println(persona1.toString());
		persona1.setAltura(1.2);
		System.out.println(persona1.toString());
		System.out.println("La Altura de esta persona es: " + persona1.getAltura());
		
		Persona P2 =new Persona(99);
		System.out.println("Persona 2 = " + P2.toString());
		
		P2.setAltura(3.5);
		P2.setPeso(180);
		P2.setPelo(true);
		P2.setVoz("METALICA");
		
		System.out.println("Persona 2" + P2.toString());
	}

}
