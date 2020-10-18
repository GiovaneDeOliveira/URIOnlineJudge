import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );
		DecimalFormat df = new DecimalFormat("#0.0");

		String entradas = in.nextLine();
		String valores[] = entradas.split(" ");
		double n1, n2, n3, n4;
		n1 = Double.parseDouble(valores[0]);
		n2 = Double.parseDouble(valores[1]);
		n3 = Double.parseDouble(valores[2]);
		n4 = Double.parseDouble(valores[3]);
		double media;
		media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10.0;
		System.out.println("Media: " + df.format(media));
		if (media >= 7) {
			System.out.println("Aluno aprovado.");

		}
		else if (media >= 5) {
			System.out.println("Aluno em exame.");
			double ne = in.nextDouble();
			System.out.println("Nota do exame: " + ne);
			media = (media+ne)/2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(media));
		}
		else {
			System.out.println("Aluno reprovado.");
		}
	}

}