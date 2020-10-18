import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		double salario = in.nextDouble();
		double imposto;

		if (salario <= 2000) {
			System.out.println("Isento");
		}
		else {
			if (salario <= 3000) {
				imposto = (salario - 2000)*0.08;
			}
			else if (salario <= 4500) {
				salario = salario - 2000;
				imposto = (salario - 1000)*0.18;
				imposto = imposto + 1000*0.08;
			}
			else {
				imposto = (salario - 4500)*0.28;
				imposto = imposto + 1000*0.08+1500*0.18;	
			}
			System.out.printf("R$ %.2f%n", imposto);
		}
	}

}