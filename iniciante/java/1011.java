import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner in = new Scanner( System.in );
    	
    	double raio;
    	
    	raio = in.nextDouble();
    	
    	double total = (4.0*3.14159*raio*raio*raio)/3;
       
    	System.out.printf("VOLUME = %.3f%n", total);
    }
 
}