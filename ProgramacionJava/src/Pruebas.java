
public class Pruebas {

	public static void main(String[] args) {
		
		String fragmentoNombreAlumnos = "Victor";
		String[] nombreAlumnos = {"Antonio", "Marta", "Victor Hugo", "david"};
		
		int resultado = contarUsuarios(fragmentoNombreAlumnos, nombreAlumnos);
		System.out.println("Total resultados: " + resultado);
	}
	static int contarUsuarios(String fragmentoNombreAlumno, String[] nombreAlumnos) {
		boolean encontrado = false;
		int totalEncontrados = 0;
		
		for (String nombreAlumnoActual : nombreAlumnos) {
			if (nombreAlumnoActual.contains(fragmentoNombreAlumno)) {
				encontrado = true;
			}
			if(encontrado) {
				totalEncontrados++;
				encontrado = false;
			}
		}
		return totalEncontrados;
	}
}
