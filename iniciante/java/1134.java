import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		boolean controle = true;
		int gasolina = 0, alcool = 0, diesel = 0;
		while (controle) {
			int n1 = in.nextInt();
			switch (n1) {
			case 1: alcool++; break;
			case 2: gasolina++; break;
			case 3: diesel++; break;
			case 4: controle = false; break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}