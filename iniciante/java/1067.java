import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();

		for (int i = 1; i<=n1; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}

}