import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner in = new Scanner(System.in);
    	
    	double A, B, C, MEDIA;
    	
    	A = in.nextDouble();
    	
    	B = in.nextDouble();
    	
    	C = in.nextDouble();
    
    	MEDIA = (A*0.2 + B*0.3 + C*0.5);
    	
    	System.out.printf("MEDIA = %.1f%n", (MEDIA));
    }
 
}