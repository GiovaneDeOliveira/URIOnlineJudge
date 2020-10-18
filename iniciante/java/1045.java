import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String entrada = in.nextLine();  	
		String valoresSt[] = entrada.split(" ");

		double valores[] = new double[3];

		valores[0] = Double.parseDouble(valoresSt[0]);
		valores[1] = Double.parseDouble(valoresSt[1]);
		valores[2] = Double.parseDouble(valoresSt[2]);

		Arrays.sort(valores);

		if ((valores[2]) >= (valores[0] + valores[1])) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (((valores[2])*(valores[2])) == (((valores[1])*(valores[1])) + ((valores[0])*(valores[0])))){
				System.out.println("TRIANGULO RETANGULO");
			}
			if (((valores[2])*(valores[2])) > (((valores[1])*(valores[1])) + ((valores[0])*(valores[0])))){
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (((valores[2])*(valores[2])) < (((valores[1])*(valores[1])) + ((valores[0])*(valores[0])))){
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if ((valores[2]) == (valores[0]) && (valores[0]) == (valores[1])) {
				System.out.println("TRIANGULO EQUILATERO");
			}

			if ( (((valores[2]) == (valores[0])) && ((valores[2]) != valores[1])) || 
					(((valores[1]) == (valores[0])) && ((valores[1]) != valores[2])) || 
					(((valores[2]) == (valores[1])) && ((valores[1]) != valores[0]))) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}

}