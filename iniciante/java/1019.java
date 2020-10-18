import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 

    	Scanner in = new Scanner( System.in );
    	
    	int tempo = in.nextInt();
    	
    	int segundos = tempo%60;
    	
    	tempo = tempo/60;
    	
    	int minutos = tempo%60;
    	
    	int horas = tempo/60;
    	
    	System.out.println(horas + ":" + minutos + ":" + segundos);
    }
 
}