import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		double A, B, MEDIA;

		A = in.nextDouble();

		B = in.nextDouble();

		MEDIA = (A*0.35 + B*0.75)/1.1;

		System.out.printf("MEDIA = %.5f%n", (MEDIA));
	}

}