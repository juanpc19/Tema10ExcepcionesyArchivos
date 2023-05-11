package ejercicio2;

public class NegativeMinuteException extends Exception {
	
	@Override
	public String toString() {
		return "Minuto ha recibido valor negativo.";
	}
}
