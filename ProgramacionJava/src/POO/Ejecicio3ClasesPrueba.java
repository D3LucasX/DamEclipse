package POO;

import POO.Ejercicio3Profesor;

public class Ejecicio3ClasesPrueba {

	public static void main(String[] args) {
		Ejercicio3Profesor[] Profesor_arr = {
			    new Ejercicio3Profesor("03513423J","luis","escamilla",1200,3,false),
			    new Ejercicio3Profesor("03678523J","marcos","escamilla",1900,1,true),
		};
		
		//--------------------------------------------------------------------------------//
		
		Ejercicio3Administracion[] Administracion_arr = {
			    new Ejercicio3Administracion("43523132K","paco","martin",1500,"FP",3),
			    new Ejercicio3Administracion("65474245L","pablo","ramon",1400,"Universitarios",4),
		};
		
		//--------------------------------------------------------------------------------//
		
		Ejercicio3Directivo[] Directivo_arr = {
			    new Ejercicio3Directivo("434231362K","curro","daniel",1600,true,false),
			    new Ejercicio3Directivo("564774245L","martin","martinez",1800,true,true),
		};
		
		//--------------------------------------------------------------------------------//
		
		Ejercicio3Clases[] Modulo_arr = {
			    new Ejercicio3Clases("Lengua",3,Profesor_arr[0],false),
			    new Ejercicio3Clases("Mates",1,Profesor_arr[1],false),
		};
		
		//--------------------------------------------------------------------------------//
		
		Ejercicio3Alumno[] Alumnos_arr = {
			    new Ejercicio3Alumno("043567893E","luis","castejon","21/3/2004","H",false,Modulo_arr),
			    new Ejercicio3Alumno("021567563E","felipe","martinez","21/6/2002","H",true,Modulo_arr),
		};

		
		
		//-------------------------------------------------------------------(IMPRIMIR)----------------------------------------------------------------------------------//
		
		
		
		for (int i = 0; i < Directivo_arr.length; i++) {
		    System.out.println(Directivo_arr[i]);
		}
		
		System.out.println(); 
		
		//--------------------------------------------------------------------------------//

					
		for (int i = 0; i < Administracion_arr.length; i++) {
		    System.out.println(Administracion_arr[i]);
		}
		
		System.out.println(); 
		
		//--------------------------------------------------------------------------------//

					
		for (int i = 0; i < Profesor_arr.length; i++) {
		    System.out.println(Profesor_arr[i]);
		}
		
		System.out.println(); 
		
		//--------------------------------------------------------------------------------//
		
		
		for (int i = 0; i < Modulo_arr.length; i++) {
		    System.out.println(Modulo_arr[i]);
		}
		
		System.out.println(); 
		
		//--------------------------------------------------------------------------------//

		
		for (int i = 0; i < Alumnos_arr.length; i++) {
		    System.out.println(Alumnos_arr[i]);
		}
		
	}

}
