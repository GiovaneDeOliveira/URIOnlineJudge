import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		for (int i = 1; i<=num;i++) {
			int n1 = in.nextInt();
			int soma = 0;
			for(int j = 1; j<n1; j++) {
				if (n1 % j == 0) {
					soma = soma + j;
				}
			}
			if (soma == n1) {
				System.out.println(n1 + " eh perfeito");

			}
			else {
				System.out.println(n1 + " nao eh perfeito");
			}
		}
	}

}