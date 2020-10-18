import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 

    	Scanner in = new Scanner(System.in);
    	
    	double raio, area;
    	
    	raio = in.nextDouble();
    									
    	double PI = 3.14159;
    	
    	area = raio * raio * PI;
    	
    	System.out.printf("A=%.4f%n", (area));
    }
 
}