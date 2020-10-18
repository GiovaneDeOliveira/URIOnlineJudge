import java.io.IOException;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		boolean controle = true;
		int n2 = 0;
		while (controle) {
			n2 = in.nextInt();
			if (n2>0) {
				controle = false;
			}
		}
		int soma = 0;
		for (int i = 0; i<n2;i++) {
			soma = soma + n1 + i;
		}
		System.out.println(soma);
	}

}