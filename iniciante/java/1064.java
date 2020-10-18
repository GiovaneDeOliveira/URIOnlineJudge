import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		double n1 = in.nextDouble();
		double n2 = in.nextDouble();
		double n3 = in.nextDouble();
		double n4 = in.nextDouble();
		double n5 = in.nextDouble();
		double n6 = in.nextDouble();

		int pos = 0;
		double media = 0;

		if (n1 >= 0) {
			pos++;
			media = media + n1;
		}
		if (n2 >= 0) {
			pos++;
			media = media + n2;
		}
		if (n3 >= 0) {
			pos++;
			media = media + n3;
		}
		if (n4 >= 0) {
			pos++;
			media = media + n4;
		}
		if (n5 >= 0) {
			pos++;
			media = media + n5;
		}
		if (n6 >= 0) {
			pos++;
			media = media + n6;
		}

		System.out.println(pos + " valores positivos");
		media = media / pos;
		System.out.printf("%.1f%n", media);
	}

}