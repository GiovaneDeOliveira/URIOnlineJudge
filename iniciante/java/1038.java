import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );


		String entradas = in.nextLine();
		String valores[] = entradas.split(" ");
		int codigo, quantidade;
		codigo = Integer.parseInt(valores[0]);
		quantidade = Integer.parseInt(valores[1]);
		double total;

		switch (codigo) {
		case 1: total = 4*quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		break;
		case 2: total = 4.50*quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		break;
		case 3: total = 5*quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		break;
		case 4: total = 2*quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		break;
		case 5: total = 1.5*quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		break;
		default: System.out.printf("Código inválido%n");
		}
	}

}