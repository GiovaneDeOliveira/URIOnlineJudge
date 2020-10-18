import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner in = new Scanner(System.in);
    	
    	double sal, vendas, salFinal;
    	String nome;
    	
    	nome = in.next();
    	 	
    	sal = in.nextDouble();
    	
    	vendas = in.nextDouble();
    
    	salFinal = sal + vendas*0.15;
    	
    	System.out.printf("TOTAL = R$ %.2f%n", salFinal);
    }
 
}