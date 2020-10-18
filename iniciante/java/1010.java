import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		String peca1 = in.nextLine();

		String peca1Vetor[] = peca1.split(" ");

		String peca2 = in.nextLine();

		String peca2Vetor[] = peca2.split(" ");

		try {
			int codPeca1 = Integer.parseInt(peca1Vetor[0]);
			int codPeca2 = Integer.parseInt(peca2Vetor[0]);
			int numPeca1 = Integer.parseInt(peca1Vetor[1]);
			int numPeca2 = Integer.parseInt(peca2Vetor[1]);
			double valPeca1 = Double.parseDouble(peca1Vetor[2]);
			double valPeca2 = Double.parseDouble(peca2Vetor[2]);

			double total = numPeca1*valPeca1 + numPeca2*valPeca2;

			System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		}
		catch (NumberFormatException e) {
			System.out.println("Erro! Entrada inválida");
		}
	}

}