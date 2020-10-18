import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );


		String entradas = in.nextLine();
		String valores[] = entradas.split(" ");
		double A, B, C;
		A = Double.parseDouble(valores[0]);
		B = Double.parseDouble(valores[1]);
		C = Double.parseDouble(valores[2]);

		double R1, R2, delta;
		delta = (B*B)-(4*A*C);
		if (A == 0 || delta <0) {
			System.out.println("Impossivel calcular");
		}
		else {
			R1 = (-B+Math.sqrt(delta))/(2*A);
			R2 = (-B-Math.sqrt(delta))/(2*A);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}
	}

}