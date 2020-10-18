import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner in = new Scanner( System.in );
    	
    	String entrada = in.nextLine();  	
    	String valoresSt[] = entrada.split(" ");
    	
    	int n1 = Integer.parseInt(valoresSt[0]);
    	int n2 = Integer.parseInt(valoresSt[1]);
    	
    	if (n1 > n2) {
    		if (n1%n2 == 0) {
    			System.out.println("Sao Multiplos");
    		}
    		else {
    			System.out.println("Nao sao Multiplos");
    		}
    	}
    	else if (n2 > n1) {
    		if (n2%n1 == 0) {
    			System.out.println("Sao Multiplos");
    		}
    		else {
    			System.out.println("Nao sao Multiplos");
    		}
    	}
    }
 
}