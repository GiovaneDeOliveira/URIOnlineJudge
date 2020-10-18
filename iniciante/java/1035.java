import java.io.IOException;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String entradas = in.nextLine();
		String valores[] = entradas.split(" ");
		int A, B, C, D;
		A = Integer.parseInt(valores[0]);
		B = Integer.parseInt(valores[1]);
		C = Integer.parseInt(valores[2]);
		D = Integer.parseInt(valores[3]);

		if (B > C && D > A && (C+D) > (A+B) && C >= 0 && D >= 0 && A%2==0){
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}

	}

}