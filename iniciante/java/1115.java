import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		boolean controle = true;
		while (controle) {

			String entradas = in.nextLine();

			String dados[] = entradas.split(" ");

			int x = Integer.parseInt(dados[0]);
			int y = Integer.parseInt(dados[1]);

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				controle = false;
			}
		}
	}

}