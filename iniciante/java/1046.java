import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner( System.in );
    	
    	String entrada = in.nextLine();  	
    	String valoresSt[] = entrada.split(" ");
    	
    	int h1 = Integer.parseInt(valoresSt[0]);
    	int h2 = Integer.parseInt(valoresSt[1]);
    	int total = 0;
    	if (h1 == h2) {
    		total = 24;
    	}
    	else if (h1>0) {
    		total = 24 - h1;
    		if (h2 < h1) {
    			total = total + h2;
    		}
    		else {
    			total = h2 - h1;
    		}
    	}
    	else if (h1 == 0) {
    		total = h2;
    	}
    	System.out.println("O JOGO DUROU " + total + " HORA(S)");
    }
 
}