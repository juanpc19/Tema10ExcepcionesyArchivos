package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble(Scanner s) {
		double devuelve = 0.0;

		try {
			devuelve = s.nextDouble();
			
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es double.");
		}
		return devuelve;
	}

	public static int readInt(Scanner s) {
		int devuelve = 0;

		try {
			devuelve = s.nextInt();
			
		} catch (InputMismatchException a) {
			System.out.println("El valor introducido no es int.");
		}
		return devuelve;
	}
}
