import java.util.Scanner;

public class ñeh {
	public static void main(String args[]) {
		Scanner ky = new Scanner(System.in);
		int opcionpelo;
		do {
			System.out.println("1 - WWWWWWWWW");
			System.out.println("2 - \\\\\\//////");
			System.out.println("3 - |\"\"\"\"\"\"\"|");
			System.out.println("4 - |||||||||");
			System.out.println("5 - mmmmmmmmm ");
			System.out.println("Introduce el número de la acción elegida: ");
			opcionpelo = ky.nextInt();
			if (opcionpelo < 1 || opcionpelo > 5)
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo: ");
		} while (opcionpelo < 1 || opcionpelo > 5);

		int opcionojos;
		do {
			System.out.println("1 - | O   O |");
			System.out.println("2 - |-(· ·)-|");
			System.out.println("3 - |-(o o)-|");
			System.out.println("4 - |  \\  / |");
			System.out.println("5 - | W   W | ");
			System.out.println("6 - | T   T | ");
			System.out.println("Introduce el número de la acción elegida: ");
			opcionojos = ky.nextInt();
			if (opcionojos < 1 || opcionojos > 6)
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo: ");
		} while (opcionojos < 1 || opcionojos > 6);

		int opcionnariz;
		do {
			System.out.println("1 - @   J   @");
			System.out.println("2 - {   \"   }");
			System.out.println("3 - [   j   ]");
			System.out.println("4 - <   -   >");
			System.out.println("Introduce el número de la acción elegida: ");
			opcionnariz = ky.nextInt();
			if (opcionnariz < 1 || opcionnariz > 4)
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo: ");
		} while (opcionnariz < 1 || opcionnariz > 4);

		int opcionboca;
		do {
			System.out.println("1 - |  ===  |");
			System.out.println("2 - |   -   |");
			System.out.println("3 - |  ___  |");
			System.out.println("4 - |  ---  |");
			System.out.println("Introduce el número de la acción elegida: ");
			opcionboca = ky.nextInt();
			if (opcionboca < 1 || opcionboca > 4)
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo: ");
		} while (opcionboca < 1 || opcionboca > 4);

		switch (opcionpelo) {
		case 1:
			System.out.println(" WWWWWWWWW ");
			break;
		case 2:
			System.out.println(" \\\\\\////// ");
			break;
		case 3:
			System.out.println(" |\"\"\"\"\"\"\"| ");
			break;
		case 4:
			System.out.println(" ||||||||| ");
			break;
		case 5:
			System.out.println(" mmmmmmmmm ");
			break;
		}
		switch (opcionojos) {
		case 1:
			System.out.println(" | O   O | ");
			break;
		case 2:
			System.out.println(" |-(· ·)-| ");
			break;
		case 3:
			System.out.println(" |-(o o)-| ");
			break;
		case 4:
			System.out.println(" | \\   / | ");
			break;
		case 5:
			System.out.println(" | W   W | ");
			break;
		case 6:
			System.out.println(" | T   T | ");
			break;
		}
		switch (opcionnariz) {
		case 1:
			System.out.println(" @   J   @ ");
			break;
		case 2:
			System.out.println(" {   \"   } ");
			break;
		case 3:
			System.out.println(" [   j   ] ");
			break;
		case 4:
			System.out.println(" <   -   > ");
			break;
		}
		switch (opcionboca) {
		case 1:
			System.out.println(" |  ===  | ");
			break;
		case 2:
			System.out.println(" |   -   | ");
			break;
		case 3:
			System.out.println(" |  ___  | ");
			break;
		case 4:
			System.out.println(" |  ---  | ");
			break;
		}
		System.out.println(" \\_______/ ");

		ky.close();
	}
}
