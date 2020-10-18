import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();  	
		String valoresSt[] = entrada.split(" ");

		int h1 = Integer.parseInt(valoresSt[0]);
		int h2 = Integer.parseInt(valoresSt[2]);
		int m1 = Integer.parseInt(valoresSt[1]);
		int m2 = Integer.parseInt(valoresSt[3]);

		//horas
		int total = 0;
		if (((h1 == h2) && (m2<m1)) || ((h1 == h2) && (m2 == m1))) {
			total = 24;
		}
		else if(h1 == h2 && m2>m1) {
			total = 0;
		}

		else if (h1>0) {
			total = 24 - h1;
			if (h2 < h1) {
				total = total + h2;
			}
			else {
				total = h2 - h1;
			}
		}
		else if (h1 == 0) {
			total = h2;
		}

		int totalMin = 0;
		//minutos
		if (m1 == m2) {
			totalMin = 0;
		}
		else if (m2 > m1) {
			totalMin = m2 - m1;
		}
		else {
			totalMin = 60 - (m1-m2);
			total = total - 1;
		}
		System.out.println("O JOGO DUROU " + total + " HORA(S) E " + totalMin + " MINUTO(S)");

	}

}