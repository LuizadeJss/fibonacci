import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        boolean pertenceOuNao = false;

        for (int i = 1; i < numero; i++) {
            if(fibonacci(i) == numero){
                pertenceOuNao = true;
            }
        }

        if(pertenceOuNao)
            System.out.println("Pertence a sequência de Fibonacci");
        else
            System.out.println("Não pertence a sequência de Fibonacci");
    }
}
