import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner in = new Scanner(System.in);
    	String numero = in.nextLine();
    	int num = Integer.parseInt(numero);
    	int total, coelho = 0 , sapo = 0, rato = 0;
    	String entradas;
    	for (int i = 1; i<=num;i++) {
    		entradas = in.nextLine();
    		String entrada [] = entradas.split(" ");
    		int n1 = Integer.parseInt(entrada[0]);
    		if (entrada[1].equals("C")) {
    			coelho = coelho + n1;
    		}
    		else if (entrada[1].equals("R")) {
    			rato = rato + n1;
    		}
    		else {
    			sapo = sapo + n1;
    		}
    	}
    	
    	total = coelho+sapo+rato;
    	System.out.println("Total: " + total + " cobaias");
    	System.out.println("Total de coelhos: " + coelho);
    	System.out.println("Total de ratos: " + rato);
    	System.out.println("Total de sapos: " + sapo);
    	
    	double pc =  ((double) coelho/total) * 100;
    	double pr = ((double) rato/total) * 100;
    	double ps = ((double) sapo/total) * 100;

    	System.out.printf("Percentual de coelhos: %.2f %%%n", pc);
    	System.out.printf("Percentual de ratos: %.2f %%%n", pr);
    	System.out.printf("Percentual de sapos: %.2f %%%n", ps);
    }
 
}