public class ExercicioSaldoBancario {
    public static void main(String[] args) {

        String nome = "Leandro";
        boolean contaCorrente = true;
        double saldoInicial = 2500.99;
        String tipoConta;

        if(contaCorrente == true ) {
            tipoConta = "Conta Corrente";
        } else {
            tipoConta = "Conta Poupança";
        }


        System.out.println("****************************");
        System.out.println("\nDados Iniciais do Cliente:");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("\n");
    }
}
