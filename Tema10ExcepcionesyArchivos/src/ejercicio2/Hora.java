package ejercicio2;

/**
 * clase que contendra metodos para modificar y mostrar una hora en horas y
 * minutos
 * 
 * @author jperez
 *
 */
public class Hora {

	protected int hora;// atributo que guardara valor de hora

	protected int minuto;// atributo que guardara valor de minuto

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param hora   contendra valor para atributo hora
	 * @param minuto contendra valor para atributo minuto
	 * @throws NegativeHourException   indica valor de parametro de entrada negativo
	 * @throws NegativeMinuteException indica valor de parametro de entrada negativo
	 */
	public Hora(int hora, int minuto) throws NegativeHourException, NegativeMinuteException {

		// si minuto menor a 0 lanzo excepcion
		if (hora < 0) {
			throw new NegativeHourException();
		}
		// si minuto menor a 0 lanzo excepcion
		if (minuto < 0) {
			throw new NegativeMinuteException();
		}

		// si hora y minuto estan dentro del rango de valores correctos
		if (hora >= 0 & hora <= 23 && minuto >= 0 && minuto <= 59) {
			// los asigno a sus atributos
			this.hora = hora;
			this.minuto = minuto;
		}
	}

	/**
	 * setter de atributo hora
	 * 
	 * @param hora contendra valor para atributo hora
	 * @return posible devolvera true o false segun sea posible modificar hora o no
	 * @throws NegativeHourException indica valor de parametro de entrada negativo
	 */
	public boolean setHora(int hora) throws NegativeHourException {
		boolean posible = false;

		// si hora menor a 0 lanzo excepcion
		if (hora < 0) {
			throw new NegativeHourException();
		}
		// si hora esta dentro del rango de valores correctos
		if (hora >= 0 & hora <= 23) {
			// asgino su valor atributo hora
			this.hora = hora;
			// y doy a posible valor true
			posible = true;
		}
		return posible;
	}

	/**
	 * setter de atributo minuto
	 * 
	 * @param minuto contendra valor para atributo minuto
	 * @return posible devolvera true o false segun sea posible modificar minuto o
	 *         no
	 * @throws NegativeMinuteException indica valor de parametro de entrada negativo
	 */
	public boolean setMinuto(int minuto) throws NegativeMinuteException {
		boolean posible = false;

		// si minuto menor a 0 lanzo excepcion
		if (minuto < 0) {
			throw new NegativeMinuteException();
		}
		// si minuto esta dentro del rango de valores correctos
		if (minuto >= 0 && minuto <= 59) {
			// asigno su valor a atributo minuto
			this.minuto = minuto;
			// y doy a posible valor true
			posible = true;
		}
		return posible;
	}

	/**
	 * metodo que avanzara la hora en 1 minuto haciendo los cambios necesarios en
	 * atributos hora y minuto
	 */
	public void inc() {
		// avanzo 1 minuto
		minuto++;
		// si despues de esto minuto toma un valor igual a 60
		if (minuto == 60) {
			// doy a minuto valor igual a 0
			minuto = 0;
			// incremento hora en +1
			hora++;
			// y compruebo si despues de esto hora tiene valor igual a 24
			if (hora == 24) {
				// si es asi modifico valor de hora a 0
				hora = 0;
			}
		}
	}

	/**
	 * metodo que devolvera una cadena para imprimir por pantalla con valor de los
	 * atributos del objeto con el que se le llama
	 */
	@Override
	public String toString() {
		String resultado = "";
		// si hora mayor o igual a 9 anado 0 a la cadena
		if (hora <= 9) {
			resultado += "0";
		}
		// independientemente de condicion anterior anado hora a la cadena
		resultado += hora + ":";
		// si minuto mayor o igual a 9 anado 0 a la cadena
		if (minuto <= 9) {

			resultado += "0";
		}
		// independientemente de condicion anterior anado hora a la cadena
		resultado += minuto;

		return resultado;
	}

}
