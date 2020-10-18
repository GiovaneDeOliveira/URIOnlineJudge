import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int n1 = 0, n2 = 0, n3 = 0;
		if (n >= 0) {
			System.out.print("0");
			n1 = 0;
		}
		if (n >= 1) {
			System.out.printf(" 1");
			n2 = 1;
		}
		for (int i = 1; i<=n-2; i++) {
			n3 = n2 + n1;
			if (i<=n-3) {
				System.out.printf(" " + n3);
			}
			else {
				System.out.println(" " + n3);
			}

			n1 = n2;
			n2 = n3;
		}
	}

}