import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		int n5 = in.nextInt();

		int pos = 0;

		if (n1 % 2 == 0) {
			pos++;
		}
		if (n2 % 2 == 0) {
			pos++;
		}
		if (n3 % 2 == 0) {
			pos++;
		}
		if (n4 % 2 == 0) {
			pos++;
		}
		if (n5 % 2 == 0) {
			pos++;
		}


		System.out.println(pos + " valores pares");
	}

}