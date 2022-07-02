package testSel;

public class Ejemplo_CO_DemoVehiculo {

	public static void main(String[] args) {
		Ejemplo_CO_Vehiculo minivan = new Ejemplo_CO_Vehiculo();
		
		int rango;
		
		//Asignar valores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango asumiendo tanque lleno de gasolina
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + "km");
		
		Ejemplo_CO_Vehiculo carro = new Ejemplo_CO_Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero en pasajero de carro es: " + carro.pasajeros);

	}

}
