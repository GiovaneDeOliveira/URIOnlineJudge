import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();

		String valores[] = entrada.split(" ");



		try {
			int A, B, C;
			A = Integer.parseInt(valores[0]);
			B = Integer.parseInt(valores[1]);
			C = Integer.parseInt(valores[2]);

			int MaiorAB;
			MaiorAB = (A+B+Math.abs(A-B))/2;
			int maior= (MaiorAB+C+Math.abs(MaiorAB-C))/2;

			System.out.println(maior + " eh o maior");

		}
		catch (NumberFormatException e) {
			System.out.println("Erro! Entrada inválida");
		}
	}

}