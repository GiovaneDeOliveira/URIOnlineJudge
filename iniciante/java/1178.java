import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		double  num = in.nextDouble();

		double vetor [] = new double [100];
		for (int i = 0; i<100; i++) {
			vetor[i] = num;
			num = num / 2;
		}

		for (int i = 0; i<100; i++) {
			System.out.printf("N[%d] = %.4f%n", i, vetor[i]);
		}
	}

}