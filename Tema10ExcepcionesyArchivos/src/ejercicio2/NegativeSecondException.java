package ejercicio2;

public class NegativeSecondException extends Exception {

	/**
	 * metodo que modifica el toString por defecto de Exception para que devuelva
	 * una string acorde a NegativeSecondException
	 */
	@Override
	public String toString() {
		return "Segundo ha recibido valor negativo.";
	}

}
