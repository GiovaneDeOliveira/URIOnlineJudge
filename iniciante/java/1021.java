import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner( System.in );

		double valor = in.nextDouble();
		while (valor < 0 || valor > 1000000) {
			System.out.println("Valor inválido! Tente novamente!");
			valor = in.nextDouble();
		}

		int n100, n50, n20, n10, n5, n2, m100, m50, m25, m10, m5, m1;
		valor = valor*100;
		int valorInt = (int)valor; 
		n100 = valorInt/10000;
		valorInt = valorInt%10000;
		n50 = valorInt/5000;
		valorInt = valorInt%5000;
		n20 = valorInt/2000;
		valorInt = valorInt%2000;
		n10 = valorInt/1000;
		valorInt = valorInt%1000;
		n5 = valorInt/500;
		valorInt = valorInt%500;
		n2 = valorInt/200;
		valorInt = valorInt%200;
		m100 = valorInt/100;
		valorInt = valorInt%100;
		m50 = valorInt/50;
		valorInt = valorInt%50;
		m25 = valorInt/25;
		valorInt = valorInt%25;
		m10 = valorInt/10;
		valorInt = valorInt%10;
		m5 = valorInt/5;
		valorInt = valorInt%5;
		m1 = valorInt/1;
		valorInt = valorInt%1;

		System.out.println("NOTAS:");    	
		System.out.println(n100 + " nota(s) de R$ 100.00");    
		System.out.println(n50 + " nota(s) de R$ 50.00");    
		System.out.println(n20 + " nota(s) de R$ 20.00");    
		System.out.println(n10 + " nota(s) de R$ 10.00");    
		System.out.println(n5 + " nota(s) de R$ 5.00");    
		System.out.println(n2 + " nota(s) de R$ 2.00");    
		System.out.println("MOEDAS:");    	
		System.out.println(m100 + " moeda(s) de R$ 1.00");  
		System.out.println(m50 + " moeda(s) de R$ 0.50");  
		System.out.println(m25 + " moeda(s) de R$ 0.25");  
		System.out.println(m10 + " moeda(s) de R$ 0.10");  
		System.out.println(m5 + " moeda(s) de R$ 0.05");  
		System.out.println(m1 + " moeda(s) de R$ 0.01"); 
	}

}