import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {
			int n1 = i;
			int n2 = i * i;
			int n3 = i * i * i;
			System.out.println(n1 + " " + n2 + " " + n3);
		}
	}

}