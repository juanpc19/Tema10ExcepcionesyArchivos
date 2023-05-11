package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);
		
		System.out.println(Utils.readDouble(dogma));

		System.out.println(Utils.readInt(dogma));

		dogma.close();
	}

}
