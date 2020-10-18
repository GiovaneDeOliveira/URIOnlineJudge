import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		int tempo = in.nextInt();

		int velocidade = in.nextInt();

		int distancia = tempo * velocidade;

		double litros = distancia/12.0;

		System.out.printf("%.3f%n", litros);
	}

}