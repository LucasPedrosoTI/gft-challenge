package ContaCorrente;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import Conta.Conta;

public final class ContaCorrente extends Conta {

  @Override
  public String rendimento() {
    DecimalFormat df = new DecimalFormat("###.##");
    double result = this.saldo.multiply(new BigDecimal(0.03)).doubleValue();

    return df.format(result);
  }

}