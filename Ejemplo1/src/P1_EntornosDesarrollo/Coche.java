/*
 * CLASE COCHE CON MARCA MODELO Y POTENCIA
 * @AUTHOR: JOSE MARIA DE LUCAS PLATA
 */


package P1_EntornosDesarrollo;

// AQUI IMPORTARIAMOS LAS LIBRERÍAS.

public class Coche {
	private String marca;
	private String modelo;
	private int potencia;
	
	//CONSTRUCTOR CON TODOS LOS DATOS DEL COCHE
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = 0;
	}
		
	//CONSTRUCTOR CON TODOS LOS DATOS DEL COCHE, LOS QUE MAS DATOS VAN A CONSTRUIR ABAJO, Y LOS QUE MENOS VAYAN A CONSTRUIR ARRIBA.
	public Coche(String marca, String modelo, int potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}
	
	
	// MÉTODOS = FUNCIONES
		// GETTERS Y SETTERS
			// CON  LOS GETTERS OBTENGO EL VALOR DE LOS ATRIBUTOS.
	public String getModelo() {
		return this.modelo;
	}
	public String getMarca() {
		return this.marca;
	}
	public int getPotencia() {
		return this.potencia;
	}
	
	// SETTERS, FUNCIONES QUE NOS PERMITEN MODIFICAR LOS VALORES DE LOS ATRIBUTOS.
	public void setMarca(String m) {
		this.marca = m;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public void setPotencia(int p) {
		this.potencia = p;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
	}
	
	// RESTO DE LAS FUNCIONES RELACIONADAS CON EL COCHE, SE PONDRIAN AQUI.
	
	
}
