package ejercicio3;

public class Main {

	public static void main(String[] args) {

		try {
			Fecha fecha = new Fecha(12, 12, 1222);
			// fecha.setDia(0);
			// fecha.setMes(0);

		} catch (ErrorDiaException e) {
			System.out.println(e.toString());

		} catch (ErrorMesException e) {
			System.out.println(e.toString());
		}

		try {
			Fecha fecha1 = new Fecha(12, 0, 1222);

		} catch (ErrorDiaException e) {
			System.out.println(e.toString());

		} catch (ErrorMesException e) {
			System.out.println(e.toString());
		}

		try {
			Fecha fecha2 = new Fecha(0, 12, 1222);

		} catch (ErrorDiaException e) {
			System.out.println(e.toString());

		} catch (ErrorMesException e) {
			System.out.println(e.toString());
		}

		try {
			Fecha fecha3 = new Fecha(0, 0, 1222);

		} catch (ErrorDiaException e) {
			System.out.println(e.toString());

		} catch (ErrorMesException e) {
			System.out.println(e.toString());
		}

	}

}
