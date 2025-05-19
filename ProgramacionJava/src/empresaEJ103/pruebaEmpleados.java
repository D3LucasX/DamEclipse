package empresaEJ103;

public class pruebaEmpleados {

	public static void main(String[] args) {
		empleados empleado1 = new empleados("Manuel", 3, 1600.00);
		//empleado1.nivelPermanencia(empleado1.permanencia, empleado1.nivelPermanencia);
		empleado1.setSalario(20);
		System.out.println("Empleado 1 = " + empleado1.toString());
		
		empleados empleado2 = new empleados("Marescuti", 10, 1800.00);
		empleado2.setSalario(25);
		System.out.println("Empleado 2 = " + empleado2.toString());
		
		empleados empleado3 = new empleados("MEO", 30, 2300.00);
		empleado3.setSalario(30);
		System.out.println("Empleado 3 = " + empleado3.toString());
	}

}
