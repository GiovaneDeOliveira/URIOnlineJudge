import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();  	
		String valoresSt[] = entrada.split(" ");

		int tamanho = valoresSt.length;

		int valores[] = new int [tamanho];

		for (int i = 0; i<valoresSt.length; i++) {
			valores[i] = Integer.parseInt(valoresSt[i]);

		}

		Arrays.sort(valores);
		for (int val : valores) {
			System.out.println(val);
		}
		System.out.println();
		for (String val : valoresSt) {
			System.out.println(val);
		}
	}

}