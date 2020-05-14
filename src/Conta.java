public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;


    public Conta(int agencia, int numero) {
        total++;
        this.numero = numero;
        this.agencia = agencia;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente: " + this.saldo
            + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
       this.saca(valor);
       destino.deposita(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (this.verificaValor(numero)) {
            this.numero = numero;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public boolean verificaValor(int valor) {
        if (valor <= 0) {
            System.out.println("O valor não pode ser negativo");
            return false;
        }
        return true;
    }
    public void setAgencia(int agencia) {
        if (this.verificaValor(numero)) {
            this.agencia = agencia;
        }
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
}
