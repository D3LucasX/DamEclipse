package POO;

public class Persona {

		int edad;
		double altura;
		double peso;
		boolean pelo;
		String voz;
		
		
		
		

		public Persona(int edad, double altura, double peso, boolean pelo, String voz) {
			super(); // Lama a la clase padre, ahora en este ejemplo no tenemos clase padre, por ejemplo
					 // Si hay una clase padre que ya tiene un constructor igual, se lo delega y lo manda para que sea
					 // la clase padre la que se encargue.
			this.edad = edad;
			this.altura = altura;
			this.peso = peso;
			this.pelo = pelo;
			this.voz = voz;
		}
		
		public Persona(int edad) {
			super(); // Lama a la clase padre, ahora en este ejemplo no tenemos clase padre, por ejemplo
					 // Si hay una clase padre que ya tiene un constructor igual, se lo delega y lo manda para que sea
					 // la clase padre la que se encargue.
			this.edad = edad;
		}
		
		
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public double getPeso() {
			return peso;
		}
		// EN LOS BOOLEANOS EL GET ES IS, POR QUE ES VERDADERO O FALSO
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public boolean isPelo() {
			return pelo;
		}
		public void setPelo(boolean pelo) {
			this.pelo = pelo;
		}
		
		public String getVoz() {
			return voz;
		}
		public void setVoz(String voz) {
			this.voz = voz;
		}
		
		@Override
		public String toString() {
			return "Esta persona es: [edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", pelo=" + pelo + ", voz=" + voz
					+ "]";
		}



}
