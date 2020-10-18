import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		long fibonacci [] = new long [61];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		long novoT;
		for (int j = 2; j<61; j++) {
			novoT = fibonacci[j-2] + fibonacci[j-1];
			fibonacci[j] = novoT;
		}

		for (int i = 1; i<=num; i++) {
			int fib = in.nextInt();
			System.out.println("Fib(" + fib + ") = " + fibonacci[fib]);
		}
	}

}