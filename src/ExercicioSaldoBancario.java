import java.util.Scanner;

public class ExercicioSaldoBancario {
    public static void main(String[] args) {

        String nome = "Leandro";
        String tipoDeConta = "Conta corrente";
        double saldoInicial = 2500.99;
        int tentativasSenha = 0;
        Scanner respostaCliente = new Scanner(System.in);


        int senhaCliente = respostaCliente.nextInt();

        while (senhaCliente != 1234 && tentativasSenha < 3) {
            System.out.println("Insira a senha: ");
            senhaCliente = respostaCliente.nextInt();
            tentativasSenha++;

            if (senhaCliente != 1234) {
                int tentativasRestantes = 3 - tentativasSenha;
                if (tentativasRestantes > 1) {
                    System.out.println("Você tem " + tentativasRestantes + " tentativas restantes antes do bloqueio da conta.");
                } else if (tentativasRestantes == 1) {
                    System.out.println("Você tem uma tentativa restante antes do bloqueio da conta.");
                }
            }

            if(senhaCliente == 1234) {
                System.out.println("****************************");
                System.out.println("\nDados Iniciais do Cliente:");
                System.out.println("Nome: " + nome);
                System.out.println(tipoDeConta);
                System.out.println("Saldo Inicial: " + saldoInicial);
                System.out.println("\n****************************");


            } else if  (tentativasSenha >= 3) {
                System.out.println("Você excedeu o número de tentativas. A conta está bloqueada.");
            }

        }









    }
}
