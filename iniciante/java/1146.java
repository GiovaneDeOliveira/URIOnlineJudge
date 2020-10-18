import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		boolean controle = true;
		while (controle) {
			int n1 = in.nextInt();
			if (n1 != 0) {
				for (int i = 1; i<=n1; i++) {
					if (i == n1) {
						System.out.println(i);
					}
					else {
						System.out.printf(i + " ");
					}
				}
			}
			else {
				controle = false;
			}

		}
	}

}