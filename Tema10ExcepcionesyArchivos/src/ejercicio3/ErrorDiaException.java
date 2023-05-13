package ejercicio3;

public class ErrorDiaException extends Exception {

	@Override
	public String toString() {
		return "Error el dia introducido es igual o menor a 0.";
	}
}
