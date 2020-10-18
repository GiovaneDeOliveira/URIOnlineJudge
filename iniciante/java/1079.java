import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String nInicial = in.nextLine();
		int n = Integer.parseInt(nInicial);

		for (int i = 1; i<=n; i++) {
			String ler = in.nextLine();
			String dados [] = ler.split(" ");
			double n1 = Double.parseDouble(dados[0]);
			double n2 = Double.parseDouble(dados[1]);
			double n3 = Double.parseDouble(dados[2]);

			double media = n1*0.2+n2*0.3+n3*0.5;
			System.out.printf("%.1f%n", media);
		}
	}

}