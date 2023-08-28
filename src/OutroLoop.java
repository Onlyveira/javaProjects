import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual a sua nota de avaliação? caso queira encerrar digita -1");
            nota = leitura.nextDouble();
            media += nota;
            totalDeNotas++;
        }

        System.out.println(media);
        System.out.println(totalDeNotas);
    }}
