import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String X[] = new String[10];
		int n1 = in.nextInt();
		X[0] = String.valueOf(n1);

		for (int i = 1; i<10; i++) {
			n1 = n1 * 2;
			X[i] = String.valueOf(n1);


		}
		for (int i = 0; i<10; i++) {
			System.out.println("N["+i+"] = "+X[i]);
		}

	}

}