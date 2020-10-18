import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int A, B, C, D, DIFERENCA;

		A = in.nextInt();

		B = in.nextInt();

		C = in.nextInt();

		D = in.nextInt();

		DIFERENCA = (A*B - C*D);

		System.out.println("DIFERENCA = " + DIFERENCA);
	}

}