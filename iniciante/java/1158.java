import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		String num = in.nextLine();
		int n = Integer.parseInt(num);

		for (int i = 1; i <= n; i++) {
			String entradas = in.nextLine();
			String dados[] = entradas.split(" ");
			int x = Integer.parseInt(dados[0]);
			int y = Integer.parseInt(dados[1]);
			int soma = 0;
			boolean controle = true;
			while (y > 0) {
				if (x%2!=0) {
					soma = soma + x;
					x = x+2;
					y--;
				}
				else {
					x++;
				}
			}
			System.out.println(soma);
		}
	}

}