import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();

		for (int i = 1; i<= 10000; i++) {

			if (i%n1==2) {
				System.out.println(i);
			}


		}
	}

}