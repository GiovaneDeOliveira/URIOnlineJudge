import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 

    	Scanner in = new Scanner( System.in );
    	
    	int A, B, PROD;
    	
        A = in.nextInt();
        B = in.nextInt();
        PROD = A * B;
        
        System.out.println("PROD = " + PROD);
 
    }
 
}