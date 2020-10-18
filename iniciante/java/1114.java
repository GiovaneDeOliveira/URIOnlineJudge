import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int controle = 1;

		while (controle != 0) {

			int senha = in.nextInt();
			if (senha != 2002) {
				System.out.println("Senha Invalida");
			}
			else {
				System.out.println("Acesso Permitido");
				controle = 0;
			}
		}
	}

}