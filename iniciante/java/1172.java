import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String X[] = new String[10];

		for (int i = 0; i<10; i++) {
			String j = in.nextLine();
			int k = Integer.parseInt(j);
			if (k <= 0) {
				X[i] = "1";
			}
			else {
				X[i] = j;
			}

		}
		for (int i = 0; i<10; i++) {
			System.out.println("X["+i+"] = "+X[i]);
		}
	}

}