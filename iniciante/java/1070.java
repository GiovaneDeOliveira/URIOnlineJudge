import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int control = 1;
		int i = 0;
		while (control == 1) {
			if (n1%2!=0) {
				System.out.println(n1);
				i++;
			}
			if (i==6) {
				control = 0;
			}
			n1++;

		}
	}

}