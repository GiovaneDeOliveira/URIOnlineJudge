import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		//instanciando e criando objeto Scanner
		Scanner in = new Scanner( System.in );

		//declaração de variáveis
		int A, B, SOMA;

		//entrada de A
		A = in.nextInt();

		//entrada de B
		B = in.nextInt();

		//cálculo da SOMA
		SOMA = A + B;

		//resultado
		System.out.println("SOMA = " + SOMA);
	}

}