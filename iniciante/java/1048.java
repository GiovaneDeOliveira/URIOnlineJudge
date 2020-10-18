import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) throws IOException {


		DecimalFormat df = new DecimalFormat("#0");

		DecimalFormat df2 = new DecimalFormat("#0.00");

		Scanner in = new Scanner( System.in );

		double valorInicial = in.nextDouble();
		double reajuste, total;
		double percentual;
		if (valorInicial <= 400) {
			percentual = 0.15;
		}
		else if (valorInicial <= 800) {
			percentual = 0.12;
		}
		else if (valorInicial <= 1200) {
			percentual = 0.10;
		}
		else if (valorInicial <= 2000) {
			percentual = 0.07;
		}
		else {
			percentual = 0.04;
		}
		reajuste = percentual * valorInicial;
		total = valorInicial + reajuste;

		System.out.println("Novo salario: " + df2.format(total));
		System.out.println("Reajuste ganho: " + df2.format(reajuste));
		System.out.println("Em percentual: " + df.format(percentual*100) + " %");        

	}

}