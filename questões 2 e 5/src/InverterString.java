import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palavra = "teste";

        int tamanhoPalavra = palavra.length();

        char[] palavraChar = new char[tamanhoPalavra];
        char[] palavraInvertida = new char [tamanhoPalavra];

        //põe a frase em um vetor char, caractere por caractere
        for(int i = 0; i < tamanhoPalavra; i++){
            palavraChar[i] = palavra.charAt(i);
        }

        for(int i = 0; i < tamanhoPalavra; i++){
            palavraInvertida[i] = palavraChar[tamanhoPalavra - 1 - i];
        }

        palavra = new String (palavraInvertida);
        System.out.println(palavra);
    }
}
