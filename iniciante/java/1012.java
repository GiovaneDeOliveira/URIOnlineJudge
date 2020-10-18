import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();

		String valores[] = entrada.split(" ");



		try {
			double A, B, C;
			A = Double.parseDouble(valores[0]);
			B = Double.parseDouble(valores[1]);
			C = Double.parseDouble(valores[2]);

			double aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;

			aTriangulo = (A*C)/2;
			aCirculo = 3.14159*C*C;
			aTrapezio = ((A+B)*C)/2;
			aQuadrado = B*B;
			aRetangulo = A*B;

			System.out.printf("TRIANGULO: %.3f%n", aTriangulo);
			System.out.printf("CIRCULO: %.3f%n", aCirculo);
			System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
			System.out.printf("QUADRADO: %.3f%n", aQuadrado);
			System.out.printf("RETANGULO: %.3f%n", aRetangulo);
		}
		catch (NumberFormatException e) {
			System.out.println("Erro! Entrada inválida");
		}
	}

}