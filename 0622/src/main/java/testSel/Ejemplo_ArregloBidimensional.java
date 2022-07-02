package testSel;

public class Ejemplo_ArregloBidimensional {

	public static void main(String[] args) {
	    int arr[][] = {{2,7,9},{3,6,1},{7,6,2} };
	    
	    //Imprimir el valor de una posicion
	    //System.out.println(arr[2][1]);
	    
	    //Imprimir arreglo 2D
	    for(int i = 0; i <arr.length; i++) {
	    	for(int j = 0; j < arr[i].length; j++) {
	    		System.out.print(arr[i][j] + " ");
	    	}
	    	System.out.println();
	    }

	}

}
