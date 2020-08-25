package ContaPoupanca;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import Conta.*;

public final class ContaPoupanca extends Conta {

  @Override
  public String rendimento() {
    DecimalFormat df = new DecimalFormat("###.##");
    double result = this.saldo.multiply(new BigDecimal(0.05)).doubleValue();

    return df.format(result);
  }

}