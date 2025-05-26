package TallerMecanicoPruebaExamen;

import java.util.ArrayList;

public class TallerMecanico {
	String nombreTaller;
	ArrayList<Vehiculos> vehiculos;
	ArrayList<Reparaciones> reparaciones;
	public TallerMecanico(String nombreTaller, ArrayList<Vehiculos> vehiculos, ArrayList<Reparaciones> reparaciones) {
		super();
		this.nombreTaller = nombreTaller;
		this.vehiculos = vehiculos;
		this.reparaciones = reparaciones;
	}
	
	public boolean estaElVehiculo(String idAbuscar) {
		for(Vehiculos vehiculo1 : vehiculos) {
			if(vehiculo1.idRegistro.equals(idAbuscar)) {
				System.out.println("Vehiculo encontrado en nuestra base de datos.");
				return true;
			}
		}
		System.out.println("Vehiculo no encontrado en nuestra base de datos.");
		return false;
	}
	public void mostrarVehiculos(ArrayList<Vehiculos> vehiculos) {
		for (Vehiculos vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
	public void mostrarVehiculosPorId(String idAbuscar, ArrayList<Vehiculos> vehiculos) {
		for (Vehiculos vehiculo : vehiculos) {
			String idAcomparar = vehiculo.getIdRegistro();
			if (idAcomparar.equals(idAbuscar)) {
				System.out.println(vehiculo.toString());
			}
		}
	}
	public void mostrarReparaciones(ArrayList<Reparaciones> reparaciones) {
		for (Reparaciones reparacion : reparaciones) {
			System.out.println(reparacion.toString());
		}
	}
}
