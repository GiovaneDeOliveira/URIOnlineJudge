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
			if (n1 != n2) {
				if (n1 > n2) {
					System.out.println("Decrescente");
				}
				else {
					System.out.println("Crescente");
				}
			}
			else {
				controle = 0;
			}

		}
	}

}