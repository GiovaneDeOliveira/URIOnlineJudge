import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int n1 = 0, n2 = 0, n3 = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 2; j++) {
				if (j%2!=0) {
					n1 = i;
					n2 = i * i;
					n3 = i * i * i;
					System.out.println(n1 + " " + n2 + " " + n3);
				}
				else {
					n2++;
					n3++;
					System.out.println(n1 + " " + n2 + " " + n3);
				}
			}



		}
	}

}