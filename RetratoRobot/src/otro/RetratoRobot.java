package otro;

import java.awt.Color;
import java.util.Random;

public class RetratoRobot {

	private static Random r = new Random();

	private static String[][] rasgos = { { "pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||" },
			{ "ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |" },
			{ "nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >" },
			{ "boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |" },
			{ "barbilla", "\\_______/", "\\,,,,,,,/" } };

	private String pelo;
	private String ojos;
	private String nariz;
	private String boca;
	private String barbilla;

	public RetratoRobot() {
		pelo = rasgos[0][r.nextInt(rasgos[0].length - 1) + 1];
		ojos = rasgos[1][r.nextInt(rasgos[1].length - 1) + 1];
		nariz = rasgos[2][r.nextInt(rasgos[2].length - 1) + 1];
		boca = rasgos[3][r.nextInt(rasgos[3].length - 1) + 1];
		barbilla = rasgos[4][r.nextInt(rasgos[4].length - 1) + 1];
	}

	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla) {
		this(pelo, ojos, nariz, boca, barbilla, Color.WHITE);
	}

	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla, Color color) {
		this.pelo = rasgos[0][pelo];
		this.ojos = rasgos[1][ojos];
		this.nariz = rasgos[2][nariz];
		this.boca = rasgos[3][boca];
		this.barbilla = rasgos[4][barbilla];
	}

	public void setRasgo(int faccion, int rasgo) {
		switch (faccion) {
		case 0:
			pelo = rasgos[0][rasgo];
			break;
		case 1:
			ojos = rasgos[1][rasgo];
			break;
		case 2:
			nariz = rasgos[2][rasgo];
			break;
		case 3:
			boca = rasgos[3][rasgo];
			break;
		case 4:
			barbilla = rasgos[4][rasgo];
			break;
		}
	}

	@Override
	public String toString() {
		return pelo + System.getProperty("line.separator") + ojos + System.getProperty("line.separator") + nariz
				+ System.getProperty("line.separator") + boca + System.getProperty("line.separator") + barbilla;
	}

	public static String[] getRasgos(int faccion) {
		return rasgos[faccion];
	}

}