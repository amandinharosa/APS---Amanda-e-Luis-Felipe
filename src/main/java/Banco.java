
import java.util.ArrayList;
import java.util.List;

public class Banco {

private List<ContaBanco> contas = new ArrayList<ContaBanco>();

    public void adicionaConta (ContaBanco ba){
        this.contas.add(ba);
    }

    public List<ContaBanco> contaCorrente(){
        List<ContaBanco> contasRetorno = new ArrayList<ContaBanco>();
        for (ContaBanco conta : contas)
        {
            if(conta instanceof ContaBanco)
                contasRetorno.add(conta);
        }
        return contasRetorno;
    }

    public List<ContaBanco> ContaPoupanca(){
        List<ContaBanco> contasRetorno = new ArrayList<ContaBanco>();
        for (ContaBanco conta : contas)
        {
            if(conta instanceof ContaPoupanca)
                contasRetorno.add(conta);
        }
        return contasRetorno;
    }
}