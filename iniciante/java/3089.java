import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String entradas = in.nextLine();  	
		int entradasToInt = Integer.parseInt(entradas);
		while (entradasToInt>0 & entradasToInt<=10000) {
			int n1, n2, maior = 0, menor = 99999999;
			String valores = in.nextLine();
			int presentes[] = new int[entradasToInt * 2];
			String stringPresentes[] = valores.split(" ");
			for (int i = 0; i<entradasToInt*2; i++) {
				presentes[i] = Integer.parseInt(stringPresentes[i]);
			}
			n1 = presentes[0]+presentes[presentes.length-1];
			if (presentes.length == 2) {
				maior = n1;
				menor = n1;
			}
			else {
				for (int i = 1; i<presentes.length-1;i++) {
					n2 = presentes[i]+presentes[presentes.length-1-i];	
					if (n1 > n2 && n1 > maior) {
						maior = n1;
					}
					else if (n2 > n1 && n2 > maior) {
						maior = n2;
					}
					if (n1 < n2 && n1 < menor) {
						menor = n1;
					}
					else if (n2 < n1 && n2 < menor) {
						menor = n2;
					}

				}
			}

			if (maior == 0) {
				maior = n1;
				menor = n1;
			}

			System.out.println(maior + " " + menor);
			entradas = in.nextLine();  	
			entradasToInt = Integer.parseInt(entradas);
		}
	}

}