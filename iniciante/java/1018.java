import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        //instanciando e criando objeto Scanner
    	Scanner in = new Scanner( System.in );
    	
    	//declaração de variáveis
    	int valor = 0, n100, n50, n20, n10, n5, n2, n1;
    	
    	//entrada de A
    	valor = in.nextInt();
    	
    	while (valor <= 0 || valor >= 1000000) {
    		System.out.println("O valor de ser maior que 0 e menor que 1000000. Tente novamente: ");
    		valor = in.nextInt();
    	}
        
        
       System.out.println(valor);

       //notas de 100
       n100 = valor/100;
       valor = valor%100;
       System.out.println(n100 +" nota(s) de R$ 100,00");
       
       //notas de 50
       n50 = valor/50;
       valor = valor%50;
       System.out.println(n50 + " nota(s) de R$ 50,00");
       
       //notas de 20
       n20 = valor/20;
       valor = valor%20;
       System.out.println(n20 + " nota(s) de R$ 20,00");
       
       //notas de 10
       n10 = valor/10;
       valor = valor%10;
       System.out.println(n10 + " nota(s) de R$ 10,00");
       
       //notas de 5
       n5 = valor/5;
       valor = valor%5;
       System.out.println(n5 + " nota(s) de R$ 5,00");
       
       //notas de 2
       n2 = valor/2;
       valor = valor%2;
       System.out.println(n2 + " nota(s) de R$ 2,00");
       
       //notas de 1
       n1 = valor/1;
       valor = valor%1;
       System.out.println(n1 + " nota(s) de R$ 1,00");
 
    }
 
}