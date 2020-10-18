import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		boolean controle = true;

		while (controle) {
			int x = in.nextInt();
			if (x == 0) {
				controle = false;
			}
			else {
				int cont = 1;
				int soma = 0;
				while (cont <= 5) {
					if (x%2 == 0){
						soma = soma + x;
						x=x+2;
						cont++;
					}
					else {
						x = x+1;
					}
				}
				System.out.println(soma);
			}

		}
	}

}