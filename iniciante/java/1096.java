import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		int i = 1;
		while (i<=9) {
			System.out.println("I="+i+" J=7");
			System.out.println("I="+i+" J=6");
			System.out.println("I="+i+" J=5");	
			i = i+2;
		}
	}

}