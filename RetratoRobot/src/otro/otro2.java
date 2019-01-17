package otro;

import java.util.Scanner;

public class otro2 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(new RetratoRobot());
	}

	public static int elegirRasgo(String[] rasgos) {
		System.out.println("Elige un rasgo para " + rasgos[0] + ": (1 - " + (rasgos.length - 1) + ")");
		for (int i = 1; i < rasgos.length; i++)
			System.out.println(i + " - " + rasgos[i]);
		int rasgo = in.nextInt();
		return rasgo;
	}

}
