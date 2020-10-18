import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		int idade = in.nextInt();

		int anos = idade/365;

		idade = idade%365;

		int meses = idade/30;

		int dias = idade%30;	

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)"); 
	}

}