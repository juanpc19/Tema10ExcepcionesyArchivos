package ejercicio2;

/**
 * clase que contendra metodos para modificar y mostrar la hora en horas minutos
 * y segundos
 * 
 * @author juanpesca19
 *
 */
public class HoraExacta extends Hora {

	private int segundo; // atributo que guardara el valor de segundo

	/**
	 * constructor con parametros
	 * 
	 * @param hora    contendra valor para atributo hora
	 * @param minuto  contendra valor para atributo minuto
	 * @param segundo contendra valor para atributo segundo
	 * 
	 * @throws NegativeHourException   indica valor de parametro de entrada negativo
	 * @throws NegativeMinuteException indica valor de parametro de entrada negativo
	 * @throws NegativeSecondException indica valor de parametro de entrada negativo
	 */
	public HoraExacta(int hora, int minuto, int segundo)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		// se heredan hora y minuto de su super
		super(hora, minuto);
		// si hora menor a 0 lanzo excepcion
		if (hora < 0) {
			throw new NegativeHourException();
		}
		// si minuto menor a 0 lanzo excepcion
		if (minuto < 0) {
			throw new NegativeMinuteException();
		}
		// si segundo menor a 0 lanzo excepcion
		if (segundo < 0) {
			throw new NegativeSecondException();
		}
		// y si el parametro de entrada esta entre 0 y 59 incluidos asigno su valor a
		// atributo segundo
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	/**
	 * setter de atributo segundo
	 * 
	 * @param segundo
	 * @throws NegativeSecondException indica valor de parametro de entrada negativo
	 */
	public void setSegundos(int segundo) throws NegativeSecondException {
		// si el parametro de entrada esta entre 0 y 59 incluidos asigno su valor a
		// atributo segundo

		// si segundo menor a 0 lanzo excepcion
		if (segundo < 0) {
			throw new NegativeSecondException();
		}
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	/**
	 * * metodo que avanzara la hora en 1 segundo haciendo los cambios necesarios en
	 * atributo segundo y heredando metodo inc de su super que hara lo mismo con
	 * hora y minuto de ser necesario
	 */
	@Override
	public void inc() {
		// incremento atributo segundo en +1
		segundo++;
		// si despues del incremento segundo es igual a 60
		if (segundo == 60) {
			// modifico su valor a 0
			segundo = 0;
			// y llamo al metodo inc de su super para que haga cambios en minuto, lo cual
			// hara que se produzcan atambien cambios en hora de ser necesario
			super.inc();
		}
	}

	/**
	 * metodo que devolvera una cadena para imprimir por pantalla con valor de los
	 * atributos del objeto con el que se le llama, heredando parte de la cadena de
	 * su super
	 */
	@Override
	public String toString() {
		String resultado = super.toString() + ":";
		// si segundo mayor o igual a 9 anado 0 a la cadena
		if (segundo <= 9) {
			resultado += "0";
		}
		// independientemente de condicion anterior anado segundo a la cadena
		resultado += segundo;

		return resultado;
	}

}
