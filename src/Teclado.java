
import java.util.Scanner;
public class Teclado {
    Scanner input = new Scanner(System.in);
    public String lerString(){
        return input.next();
    }

    public int lerInt(){
        while(!input.hasNextInt()){
            System.err.println(input.next() + " é não válido");
            System.out.print("Entre com um valor inteiro: ");
        }
        return input.nextInt();
    }

        public float lerFloat(){
            while(!input.hasNextFloat()){
            	System.err.println(input.next() + " é não válido");
                System.out.print("Entre com um valor float: ");
            }
            return input.nextFloat();
        }
        public double lerDouble() {
        	while(!input.hasNextDouble()) {
        		System.err.println(input.next() + " não é válido!");
        		System.out.println("Digite um float: ");
        	}
        	return input.nextDouble();
        }
    }
   


