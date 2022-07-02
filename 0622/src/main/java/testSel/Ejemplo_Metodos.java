package testSel;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		
		int resultado = suma(10,20);
		System.out.println(resultado);
		
		int resultado2 = suma(1,5);
		System.out.println(resultado2);
		
		int resultado3 = suma(1,56);
		System.out.println(resultado3);
		
		String car = carro(1);
		System.out.println(car);
		
	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static String carro(int a) {
		String [] cars = {"Volvo", "BMW", "Ford"};
		return cars [a];
	}

}
