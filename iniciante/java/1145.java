import java.io.IOException;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		String entradas = in.nextLine();
		String dados[] = entradas.split(" ");

		int x = Integer.parseInt(dados[0]);
		int y = Integer.parseInt(dados[1]);

		for (int i = 1; i<=y; i++) {
			if (i%x == 0) {
				System.out.println(i);
			}
			else {
				System.out.printf(i + " ");
			}
		}
	}

}