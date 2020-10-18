import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int X[] = new int[20];

		for (int i = 0; i<20; i++) {
			X[i] = in.nextInt();
		}

		int temp = 0;
		int j = 19;
		for (int i = 0; i<10; i++) {
			temp = X[i];
			X[i] = X[j];
			X[j] = temp;
			j--;
		}

		for (int i = 0; i<20; i++) {
			System.out.printf("N[%d] = %d%n", i, X[i]);
		}
	}

}