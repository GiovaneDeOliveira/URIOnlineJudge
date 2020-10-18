import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();  	
		String valoresSt[] = entrada.split(" ");

		double tamanho = valoresSt.length;

		double valores[] = new double [(int) tamanho];

		for (int i = 0; i<valoresSt.length; i++) {		
			valores[i] = Double.parseDouble(valoresSt[i]);

		}
		DecimalFormat df = new DecimalFormat("#0.0");  

		if (((valores[0] + valores[1])> valores[2]) && ((valores[0] + valores[2])> valores[1]) && 
				((valores[1] + valores[2])> valores[1]) && (Math.abs(valores[0] - valores[1]) < valores[2]) && 
				(Math.abs(valores[0] - valores[2]) < valores[1]) && (Math.abs(valores[1] - valores[2]) < valores[1])) {
			double perimetro = valores[0] + valores[1] + valores[2];
			System.out.println("Perimetro = " + df.format(perimetro));
		}
		else {
			double area = ((valores[0]+valores[1])*valores[2])/2;
			System.out.println("Area = " + df.format(area));
		}
	}

}