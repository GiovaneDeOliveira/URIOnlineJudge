import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int num2 = num * 4;
		for (int i = 1; i <= num2; i++) {
			if (i%4 == 0) {
				System.out.println("PUM");
			}
			else {
				System.out.print(i + " ");
			}
		}
	}

}