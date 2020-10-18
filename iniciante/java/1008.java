import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int numFunc, horas;
		double salHora, salario;

		numFunc = in.nextInt();

		horas = in.nextInt();

		salHora = in.nextDouble();

		salario = salHora * horas;

		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	}

}