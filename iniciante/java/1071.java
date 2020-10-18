import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int soma = 0;	
		if (n1 > n2) {
			int i = n2+1;
			while (i < n1) {
				if (i % 2 != 0 ) {
					soma = soma + i;
				}
				i++;
			}
		}
		else {
			int i = n1 + 1;
			while (i < n2) {
				if (i % 2 != 0 ) {
					soma = soma + i;
				}
				i++;
			}

		}
		System.out.println(soma);
	}

}