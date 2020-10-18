import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String numero = in.nextLine();
		int num = Integer.parseInt(numero);

		for (int i = 1; i<= num; i++) {
			String entradas = in.nextLine();
			String dados[] = entradas.split(" ");

			int n1 = Integer.parseInt(dados[0]);
			int n2 = Integer.parseInt(dados[1]);

			if (n2 != 0) {
				double calculo = (double) n1/n2;
				System.out.printf("%.1f%n", calculo);
			}
			else {
				System.out.println("divisao impossivel");
			}
		}
	}

}