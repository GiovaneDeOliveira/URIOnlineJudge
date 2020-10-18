import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		int vetor [] = new int [1000];
		int j = 0;
		for (int i = 1; i<1000; i++) {
			i = i-1;
			j = 0;
			while (j<num) {
				if (i<1000) {
					vetor[i] = j;
					i++;
					j++;
				}
				else {
					break;
				}
			}
		}

		for (int i = 0; i<1000; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}
	}

}