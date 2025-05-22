package Biblioteca;

public class Usuario {
	private String idusuario;
	private String nombre;
	public Usuario(String usuario, String nombre) {
		this.idusuario = usuario;
		this.nombre = nombre;
	}
	public String getIdusuario() {
		return idusuario;
	}
	public void setUsuario(String usuario) {
		this.idusuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombre=" + nombre + "]";
	}
	
	
	
}
