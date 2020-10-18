import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int estaIntervalo = 0, out, n2; 

		for (int i = 1; i<= n1; i++) {
			n2 = in.nextInt();
			if (n2 >= 10 && n2 <= 20) {
				estaIntervalo++;
			}

		}
		System.out.println(estaIntervalo + " in");
		out = n1 - estaIntervalo;
		System.out.println(out + " out");
	}

}