import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int maior = -1, pos = 0;

		for (int i = 1; i<= 100; i++) {
			int num = in.nextInt();

			if (num > maior) {
				maior = num;
				pos = i;
			}
		}
		System.out.println(maior);
		System.out.println(pos);
	}

}