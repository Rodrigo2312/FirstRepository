package testSel;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		//Declaracion de arreglo
		int intArray[];
		
		int [] intArray2;
		
		//Tipos de datos
		byte byteArray[];
		float floatArray[];
		
		//Declarar un array de strings
		String [] arr;
		
		//Asignar memoria para 5 enteros/datos
		arr = new String[5];
		
		//inicializamos el primer selemento del arreglo / los arreglos siempre empiezan en posicion 0
		arr [0] = "cero";
		arr [1] = "uno";
		arr [2] = "dos";
		arr [3] = "tres";
		arr [4] = "cuatro";
		
		System.out.println("Elemento en la posicion 1 es: " +arr[1]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("El elemento en la posicion " + i + " :" + arr[i]);
		}
		
		//ejemplo de arreglo
		int[] intarray1linea = new int[] {1,2,3,4,5};
 
	}

}
