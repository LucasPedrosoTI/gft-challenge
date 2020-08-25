package contas.ContaCorrente;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import contas.Conta.Conta;

public final class ContaCorrente extends Conta {
  private BigDecimal rendimento;

  @Override
  public String rendimento() {
    DecimalFormat df = new DecimalFormat("###.##");
    double result = this.saldo.multiply(new BigDecimal(0.03)).doubleValue();
    this.rendimento = new BigDecimal(result);

    return df.format(result);
  }

  @Override
  public String calcularImposto() {
    DecimalFormat df = new DecimalFormat("###.##");
    double result = this.rendimento.multiply(new BigDecimal(0.25)).doubleValue();

    return df.format(result);
  }

}