import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		double s = 1;
		int j = 2;
		for (int i = 3; i<=39; i=i+2){
			s = s + (double)i/j;
			j = j*2;
		}
		System.out.printf("%.2f%n", s);
	}

}