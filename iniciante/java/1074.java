import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2;

		for (int i = 1; i<= n1; i++) {

			n2 = in.nextInt();
			if (n2 == 0) {
				System.out.println("NULL");
			}
			else {
				if (n2%2==0) {
					System.out.printf("EVEN");
				}
				else {
					System.out.printf("ODD");
				}

				if (n2 > 0) {
					System.out.printf(" POSITIVE%n");
				}
				else {
					System.out.printf(" NEGATIVE%n");
				}
			}


		}
	}

}