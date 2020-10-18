import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);
		int controle = -1;

		while (controle!=0) {
			String nInicial = in.nextLine();
			String inicial[] = nInicial.split(" ");
			int n1 = Integer.parseInt(inicial[0]);
			int n2 = Integer.parseInt(inicial[1]);
			int soma = 0;
			if (n1 > 0 && n2 > 0) {
				if (n1 > n2) {
					for (int i = n2; i<= n1; i++) {
						System.out.printf(i + " ");
						soma = soma + i;
					}
				}
				else {
					for (int i = n1; i<= n2; i++) {
						System.out.printf(i + " ");
						soma = soma + i;
					}
				}
				System.out.printf("Sum=" + soma + "%n");
			}
			else {
				controle = 0;
			}

		}
	}

}