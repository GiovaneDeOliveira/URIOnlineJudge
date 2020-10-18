import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		boolean controle = true;
		int n2 = n1-1;
		while (controle) {
			n2 = in.nextInt();
			if (n2>n1) {
				controle = false;
			}
		}
		int soma = 0;
		for (int i = n1; i<=n2; i++) {
			soma = soma + i;
			if (soma > n2) {
				i = i - n1+1;
				System.out.println(i);
				break;
			}
		}
	}

}