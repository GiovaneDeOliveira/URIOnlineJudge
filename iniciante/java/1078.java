import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int tabuada;
		for (int i = 1; i<= 10; i++) {

			tabuada = i * n1;
			System.out.println(i + " x " + n1 + " = " + tabuada);    		

		}
	}

}