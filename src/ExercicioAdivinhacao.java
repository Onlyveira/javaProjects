import java.util.Random;
import java.util.Scanner;

public class ExercicioAdivinhacao {
    public static void main(String[] args) {

        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        Scanner leitura = new Scanner(System.in);


        System.out.println(numeroGerado);
        while(tentativas < 5){
            int palpite = leitura.nextInt();
            System.out.println("Advinhe o numero de 0 a 100");
            tentativas++;

         if(palpite == numeroGerado){
            System.out.println("Parabéns");
            break;
        }
        else if(palpite < numeroGerado) {
            System.out.println(  "Você errou, o numero é maior");
        } else {
            System.out.println("Você errou, o numero é menor");
        }

        if(tentativas == 5){
            System.out.println("O seu número de alternativas acabou");
        }
    }
}}
