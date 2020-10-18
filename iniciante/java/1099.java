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
			int n1 = Integer.parseInt(dados[0]);
			int n2 = Integer.parseInt(dados[1]);
			int soma = 0;
			if (n1 == n2) {
				System.out.println("0");
			}
			else if (n1 > n2) {
				for (int a = n2+1; a<n1; a++) {
					if (a % 2 != 0) {
						soma = soma + a;
					}
				}
				System.out.println(soma);
			}
			else {
				for (int a = n1+1; a<n2; a++) {
					if (a % 2 != 0) {
						soma = soma + a;
					}
				}
				System.out.println(soma);

			}
		}
	}

}