package PracticasExamen;

public class busquedaBinaria {
    public static void main (String[]args){
        int []array = {1,34,35,56,76,87,88,99,100, 1034,1000, 1001, 1002, 1003, 1004, 1005};
        int randomIndex = (int) (Math.random() * array.length);
        int num = array[randomIndex];
        System.out.println("Número aleatorio seleccionado: " + num);
        int primero = 0;
        int ultimo = array.length -1;
        int resultado = BusquedaBinaria(array,num, primero, ultimo);
        if (resultado == -1){
            System.out.println("El número no se ha encontrado en el array.");
        }else{
            System.out.println("El número se ha encontado en la posición¨: " + resultado);
        }
    }
    public static int BusquedaBinaria(int []array, int num, int primero, int ultimo){
       
        if(primero > ultimo){
            return -1; // No se ha encontrado el número
        }
        int medio = (primero + ultimo ) / 2;

        if (array[medio] == num){ // Si el número es igual al medio, se ha encontrado
            return medio;
        }else if(array[medio] > num){ // Si el número es menor que el medio, se busca en la mitad izquierda
            ultimo = medio-1;
            return BusquedaBinaria(array, num, primero, medio -1);
        }else{ // Si el número es mayor que el medio, se busca en la mitad derecha
            primero = medio +1;
            return BusquedaBinaria(array, num, medio +1, ultimo);
        }

    }
    
}
