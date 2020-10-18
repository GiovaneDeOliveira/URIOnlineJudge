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

		int positivos=0;
		if (n1 > 0) {
			positivos++;
		}
		if (n2 > 0) {
			positivos++;
		}
		if (n3 > 0) {
			positivos++;
		}
		if (n4 > 0) {
			positivos++;
		}
		if (n5 > 0) {
			positivos++;
		}
		if (n6 > 0) {
			positivos++;
		}

		System.out.println(positivos + " valores positivos");
	}

}