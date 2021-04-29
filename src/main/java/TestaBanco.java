    public class TestaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco1 = new Banco();
        ContaBanco b1 = new ContaBanco ("João", 1000);
        ContaBanco b2 = new ContaPoupanca ("Maria");
        b2.deposito(1000);
        ContaBanco b3 = new ContaBanco ("Carlos", 30000);
        ContaBanco b4 = new ContaBanco ("Marcelo", 12000);
        ContaBanco b5 = new ContaPoupanca ("Ana");
        ContaBanco b6 = new ContaPoupanca ("Joana");
        b5.deposito(5000);
        b2.deposito(1000);
        b5.deposito(8000);
        b6.deposito(6300);
        b5.deposito(1000);

        banco1.adicionaConta(b1);
        banco1.adicionaConta(b2);
        banco1.adicionaConta(b3);
        banco1.adicionaConta(b4);
        banco1.adicionaConta(b5);
        banco1.adicionaConta(b6);

        System.out.println(banco1.contaCorrente());
        System.out.println(banco1.ContaPoupanca());

    }

}