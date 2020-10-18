import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		String num = in.nextLine();
		int T = Integer.parseInt(num);

		for (int i = 1; i<= T; i++) {
			String entradas = in.nextLine();
			String dados[] = entradas.split(" ");
			int PA = 0;
			int PB = 0;
			double G1 = 0;
			double G2 = 0;
			if (dados.length == 4) {
				PA = Integer.parseInt(dados[0]);
				PB = Integer.parseInt(dados[1]);
				G1 = Double.parseDouble(dados[2]);
				G2 = Double.parseDouble(dados[3]);
			}


			int tempo = 0;
			while(PA <= PB) {
				PA = (int) Math.floor((PA * (1+G1/100)));
				PB = (int) Math.floor((PB * (1+G2/100)));
				tempo++;
				if (tempo >= 101) {
					break;
				}
			}
			if (tempo > 100) {
				System.out.println("Mais de 1 seculo.");
			}
			else {
				System.out.println(tempo + " anos.");
			}

		}

		in.close();
	}

}