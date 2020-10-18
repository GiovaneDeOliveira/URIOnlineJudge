import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		double X[] = new double[100];

		for (int i = 0; i<100; i++) {
			X[i] = in.nextDouble();
		}

		for (int i = 0; i<100; i++) {
			if (X[i] <= 10) {
				System.out.printf("A[%d] = %.1f%n", i, X[i]);
			}
		}
	}

}