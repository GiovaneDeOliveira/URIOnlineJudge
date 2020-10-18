import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		int j = 7;
		for (int i = 1; i<=9; i=i+2) {
			for (int i2 = 0; i2<=2; i2++) {
				System.out.println("I="+i+" J="+j);
				j--;
			}
			j = j+5;
		}
	}

}