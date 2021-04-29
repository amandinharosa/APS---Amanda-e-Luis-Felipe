public class ContaBanco {
    private static int ultimoValorConta = 1000;

    private String cliente;
    private int numeroConta;//numero conta
    protected double saldo; //saldo

    public ContaBanco (String cliente){
        this(cliente,0);
    }
    public ContaBanco(String cliente, double saldo){
        numeroConta = ultimoValorConta++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //faz depósito
    public void deposito (double quantia){
        double newSaldo = getSaldo() + quantia;
        saldo = newSaldo;
    }

    //faz saque
    public void fazSaque (double quantia){
        double newSaldo = getSaldo() - quantia;
        saldo = newSaldo;
    }

    /**
     * @return the accountNumber
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * @return the balance
     */
    public double getSaldo() {
        return saldo;
    }    

    @Override
    public String toString(){
        return "Conta de: " + cliente + " Saldo de R$ " + saldo;
    }


}