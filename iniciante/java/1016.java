import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		int distancia = in.nextInt();

		int tempo = distancia * 2;

		System.out.printf(tempo + " minutos%n");
	}

}