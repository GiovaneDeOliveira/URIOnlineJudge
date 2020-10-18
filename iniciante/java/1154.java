import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner (System.in);
		boolean controle = true;
		int soma = 0, contador = 0;

		while (controle) {
			int idade = in.nextInt();

			if (idade <0){
				controle = false;
			}
			else {
				soma = soma + idade;
				contador++;
			}

		}
		double media = (double) soma/contador;
		System.out.printf("%.2f%n", media);
	}

}