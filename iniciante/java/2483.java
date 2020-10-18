import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int valor = 0;

		valor = in.nextInt();

		System.out.print("Feliz nat");
		for (int i = 1; i<=valor; i++) {
			System.out.print("a");
		}
		System.out.println("l!");
	}

}

