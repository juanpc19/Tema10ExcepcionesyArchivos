package ejercicio2;

public class NegativeMinuteException extends Exception {
	
	/**
	 * metodo que modifica el toString por defecto de Exception para que devuelva una
	 * string acorde a NegativeMinuteException
	 */
	@Override
	public String toString() {
		return "Minuto ha recibido valor negativo.";
	}
}
