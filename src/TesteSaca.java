public class TesteSaca {
    public static void main(String[] args) {
            ContaCorrente contaCorrente = new ContaCorrente(900, 349);

            contaCorrente.deposita(900);

            try {
                contaCorrente.saca(1000);
            } catch (Exception exception) {
                System.out.println("Exception: " + exception.getMessage());
            }

        System.out.println(contaCorrente.getSaldo());
    }
}
