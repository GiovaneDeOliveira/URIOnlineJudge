import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		boolean novoCalc = true;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int grenais = 0;
		int empates = 0;
		while (novoCalc) {

			String entradas = in.nextLine();
			String dados[] = entradas.split(" ");

			int inter = Integer.parseInt(dados[0]);
			int gremio = Integer.parseInt(dados[1]);

			if (inter > gremio) {
				vitoriasInter++;
			}
			else if (gremio > inter) {
				vitoriasGremio++;
			}
			else {
				empates++;
			}

			grenais++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			String opcaoS = in.nextLine();
			int opcao = Integer.parseInt(opcaoS);

			if (opcao == 2) {
				novoCalc = false;
			}
		}

		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
	}

}