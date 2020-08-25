import java.math.BigDecimal;

import ContaCorrente.*;
import ContaPoupanca.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando uma classe => Objeto

        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(new BigDecimal(1000));

        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(new BigDecimal(1000));

        System.out.println("Rendimento Conta corrente: " + cc.rendimento());
        System.out.println("Rendimento Conta poupança: " + cp.rendimento());
    }
}
