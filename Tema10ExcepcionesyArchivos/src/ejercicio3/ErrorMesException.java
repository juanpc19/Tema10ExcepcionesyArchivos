package ejercicio3;

public class ErrorMesException extends Exception{
	
	@Override
	public String toString() {
		return "Error el mes introducido es igual o menor a 0.";
	}
}
