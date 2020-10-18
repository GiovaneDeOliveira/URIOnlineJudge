import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3;
		int soma = 0;

		if (n1 > n2) {
			n3 = n1;
			n1 = n2;
			n2 = n3;
		}

		for (int i = n1; i <= n2; i++) {
			if (i%13 != 0) {
				soma = soma + i;
			}
		}

		System.out.println(soma);

	}

}