import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int par[] = new int [5];
		int impar[] = new int [5];
		int controlePar = 0;
		int controleImpar = 0;

		for (int i = 0; i<15; i++) {
			int n1 = in.nextInt();
			if (controlePar <5) {
				if (n1 % 2 == 0) {
					par[controlePar] = n1;
					controlePar++;
				}
			}
			else {

				for (int j = 0; j<5; j++) {
					System.out.println("par["+j+"] = "+par[j]);
					par[j] = 0;
				}
				controlePar = 0;
				if (n1 % 2 == 0) {
					par[controlePar] = n1;
					controlePar++;
				}
			}
			if (controleImpar < 5) {
				if (n1 % 2 != 0) {
					impar[controleImpar] = n1;
					controleImpar++;
				}
			}
			else {
				for (int j = 0; j<5; j++) {
					System.out.println("impar["+j+"] = "+impar[j]);
					impar[j] = 0;
				}
				controleImpar = 0;
				if (n1 % 2 != 0) {
					impar[controleImpar] = n1;
					controleImpar++;
				}
			}

		}
		for (int i = 0; i<controleImpar; i++) {
			System.out.println("impar["+i+"] = "+impar[i]);
		}
		for (int i = 0; i<controlePar; i++) {
			System.out.println("par["+i+"] = "+par[i]);
		}
	}

}