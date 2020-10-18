import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		Scanner in = new Scanner(System.in);

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		int n5 = in.nextInt();

		int par = 0, impar = 0, pos = 0, neg = 0;

		if (n1 % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}
		if (n2 % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}
		if (n3 % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}
		if (n4 % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}
		if (n5 % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}

		if (n1 > 0) {
			pos++;
		}
		else if (n1 < 0) {
			neg++;
		}
		if (n2 > 0) {
			pos++;
		}
		else if (n2 < 0) {
			neg++;
		}
		if (n3 > 0) {
			pos++;
		}
		else if (n3 < 0) {
			neg++;
		}
		if (n4 > 0) {
			pos++;
		}
		else if (n4 < 0){
			neg++;
		}
		if (n5 > 0) {
			pos++;
		}
		else if (n5 < 0){
			neg++;
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
	}

}