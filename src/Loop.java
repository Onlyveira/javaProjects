import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 00;

        for (int i = 0; i < 6; i++) {
            System.out.println("Qual a sua nota de avaliação?");
            nota = leitura.nextDouble();
            media += nota;

        }



        System.out.println(media);
        System.out.println(media/3);
    }
}
