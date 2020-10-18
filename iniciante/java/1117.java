import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		boolean controle1 = true;
		boolean controle2 = true;
		double n1 = 0, n2 = 0;

		while (controle1) {
			n1 = in.nextDouble();
			if (n1 >= 0 && n1 <= 10) {
				controle1 = false;
			}
			else {
				System.out.println("nota invalida");
			}
		}

		while (controle2) {
			n2 = in.nextDouble();
			if (n2 >= 0 && n2 <= 10) {
				controle2 = false;
			} else {
				System.out.println("nota invalida");
			}
		}

		double media = (n1+n2)/2;

		System.out.printf("media = %.2f%n", media);

	}

}