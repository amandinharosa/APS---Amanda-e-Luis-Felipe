public class ContaPoupanca extends ContaBanco {
    private double juros;

    public ContaPoupanca (String cliente){
        super(cliente);
        juros=0.06;
    }

    /**
     * @return the juros
     */
    public double getJuros() {
        return juros;
    }

    @Override
    public double getSaldo(){
        return this.saldo + (this.saldo * this.juros);
    }


}