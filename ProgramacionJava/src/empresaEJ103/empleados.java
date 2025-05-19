package empresaEJ103;

public class empleados {
	private String nombreEmpleado;
	private int permanencia;
	private double salario;
	private String nivelPermanencia;
	
	
	public empleados(String nombreEmpleado, int permanencia, double salario) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.permanencia = permanencia;
		this.salario = salario;
		nivelPermanencia();
		
		
	}
	
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public int getPermanencia() {
		return permanencia;
	}
	public void setPermanencia(int permanencia) {
		this.permanencia = permanencia;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setSalario(int porcentaje) {
	    double cantidadAañadir = ((double) porcentaje) / 100;
	    cantidadAañadir = this.salario * cantidadAañadir;
	    this.salario += cantidadAañadir;
	}
	private void nivelPermanencia() {
		double porcentaje = 0;
		if (permanencia <= 3) {
			this.nivelPermanencia = "Principiante";
		}else if (permanencia > 3 && permanencia < 18) {
			this.nivelPermanencia = "Intermedio";
		}else if(permanencia >= 18) {
			this.nivelPermanencia = "Senior";
		}
	}
	
	public String getNivelPermanencia() {  // Para si queremos saber el nivel de permanencia por separado
		return nivelPermanencia;
	}
	@Override
	public String toString() {
		return "empleados [nombreEmpleado=" + nombreEmpleado + ", permanencia=" + permanencia + ", salario=" + salario
				+ ", nivelPermanencia=" + nivelPermanencia + "]";
	}
	
}
