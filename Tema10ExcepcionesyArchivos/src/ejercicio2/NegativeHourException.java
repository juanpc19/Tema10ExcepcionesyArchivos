package ejercicio2;

public class NegativeHourException extends Exception {

	/**
	 * metodo que modifica el toString por defecto de Exception para que devuelva
	 * una string acorde a NegativeHourException
	 */
	@Override
	public String toString() {
		return "Hora ha recibido valor negativo.";
	}
}
