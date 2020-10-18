import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner( System.in );

		String e1 = in.nextLine();
		String e2 = in.nextLine();
		String e3 = in.nextLine();

		if (e1.equals("vertebrado")) {
			if (e2.equals("ave")) {
				if (e3.equals("onivoro")) {
					System.out.println("pomba");
				}
				else {
					System.out.println("aguia");
				}
			}
			else {
				if (e3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if (e2.equals("inseto")) {
				if (e3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
			}
			else {
				if (e3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
		}
	}

}