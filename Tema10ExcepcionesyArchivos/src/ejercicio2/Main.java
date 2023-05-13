package ejercicio2;

public class Main {

	public static void main(String[] args) {

		try {
			HoraExacta reloj = new HoraExacta(0, 0, 0);
			// reloj.setHora(-1);
			// reloj.setMinuto(-1);
			// reloj.setSegundos(-1);

		} catch (NegativeHourException e) {
			System.out.println(e.toString());

		} catch (NegativeMinuteException e) {
			System.out.println(e.toString());

		} catch (NegativeSecondException e) {
			System.out.println(e.toString());
		}

		try {
			HoraExacta reloj1 = new HoraExacta(0, 0, 0);
		} catch (NegativeHourException e) {
			System.out.println(e.toString());

		} catch (NegativeMinuteException e) {
			System.out.println(e.toString());

		} catch (NegativeSecondException e) {
			System.out.println(e.toString());
		}

		try {
			HoraExacta reloj2 = new HoraExacta(-1, 0, 0);
		} catch (NegativeHourException e) {
			System.out.println(e.toString());

		} catch (NegativeMinuteException e) {
			System.out.println(e.toString());

		} catch (NegativeSecondException e) {
			System.out.println(e.toString());
		}

		try {
			HoraExacta reloj3 = new HoraExacta(0, -1, 0);
		} catch (NegativeHourException e) {
			System.out.println(e.toString());

		} catch (NegativeMinuteException e) {
			System.out.println(e.toString());

		} catch (NegativeSecondException e) {
			System.out.println(e.toString());
		}

		try {
			HoraExacta reloj4 = new HoraExacta(0, 0, -1);
		} catch (NegativeHourException e) {
			System.out.println(e.toString());

		} catch (NegativeMinuteException e) {
			System.out.println(e.toString());

		} catch (NegativeSecondException e) {
			System.out.println(e.toString());
		}

		try {
			HoraExacta reloj5 = new HoraExacta(-1, -1, -1);
		} catch (NegativeHourException e) {
			System.out.println(e.toString());

		} catch (NegativeMinuteException e) {
			System.out.println(e.toString());

		} catch (NegativeSecondException e) {
			System.out.println(e.toString());
		}

	}

}
