public class TesteConta {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente contaCorrente = new ContaCorrente(100, 200);
        contaCorrente.deposita(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 400);
        contaPoupanca.deposita(900);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("conta poupanca: "+contaPoupanca.getSaldo());
        System.out.println("conta corrente: "+ contaCorrente.getSaldo());

    }
}
