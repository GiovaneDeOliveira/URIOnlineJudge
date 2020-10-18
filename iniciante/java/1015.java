import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		String pontoP1 = in.nextLine();

		String pontoP2 = in.nextLine();

		String p1[] = pontoP1.split(" ");

		String p2[] = pontoP2.split(" ");

		double p1x1 = Double.parseDouble(p1[0]);
		double p1y1 = Double.parseDouble(p1[1]);

		double p2x2 = Double.parseDouble(p2[0]);
		double p2y2 = Double.parseDouble(p2[1]);

		double distancia = Math.sqrt((p2x2-p1x1)*(p2x2-p1x1)+((p2y2-p1y1)*(p2y2-p1y1)));

		System.out.printf("%.4f%n", distancia);
	}

}