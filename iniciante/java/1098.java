import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		double i = 0.0;
		double j = 1;
		while (i<2) {
			for (int i2 = 0; i2<=2; i2++) {
				if (i == 0 || i == 1 || i > 1.8) {
					System.out.printf("I=%.0f J=%.0f%n", i, j);
				}
				else {
					System.out.printf("I=%.1f J=%.1f%n", i, j);
				}

				j++;
			}
			j = j-3+0.2;
			i = i + 0.2;

		}
	}

}