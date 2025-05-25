package TallerMecanicoPruebaExamen;

import java.time.LocalDate;

public class Reparaciones {
	Vehiculos vehiculo;
	Propietarios propietario;
	LocalDate fecha;
	String comentarios;
	public Reparaciones(Vehiculos vehiculo, Propietarios propietario, LocalDate fecha, String comentarios) {
		this.vehiculo = vehiculo;
		this.propietario = propietario;
		this.fecha = fecha;
		this.comentarios = comentarios;
	}
	public Vehiculos getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Propietarios getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietarios propietario) {
		this.propietario = propietario;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public String toString() {
		return "Reparaciones [vehiculo=" + vehiculo + ", propietario=" + propietario + ", fecha=" + fecha
				+ ", comentarios=" + comentarios + "]";
	}
	
	
}
