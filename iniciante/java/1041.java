import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();  	
		String valoresSt[] = entrada.split(" ");

		double eixoX = Double.parseDouble(valoresSt[0]);
		double eixoY = Double.parseDouble(valoresSt[1]);

		if (eixoX == 0 && eixoY == 0) {
			System.out.println("Origem");
		}
		else if (eixoX == 0 && eixoY != 0) {
			System.out.println("Eixo Y");
		}
		else if (eixoX != 0 && eixoY == 0) {
			System.out.println("Eixo X");
		}
		else if (eixoX > 0 && eixoY > 0) {
			System.out.println("Q1");
		}
		else if (eixoX > 0 && eixoY < 0) {
			System.out.println("Q4");
		}
		else if (eixoX < 0 && eixoY > 0) {
			System.out.println("Q2");
		}
		else if (eixoX < 0 && eixoY < 0) {
			System.out.println("Q3");
		}
	}

}