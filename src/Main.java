import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Abraham Lincoln");

        Banco banco = new Banco();
        banco.setNome("My Bank");
        List<Conta> contas = new ArrayList<>();

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(cliente1);
        cc.transferir(100, cp);

        cc.extrato();
        cp.extrato();

        contas.add(cc);
        contas.add(cp);
        banco.setContas(contas);
        System.out.println();
        System.out.println(banco);
    }
}
