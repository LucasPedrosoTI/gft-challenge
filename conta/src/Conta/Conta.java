package Conta;

import java.math.BigDecimal;

public abstract class Conta {
  protected Long numero;
  protected String titular;
  protected BigDecimal saldo;

  protected abstract String rendimento();

  public Long getNumero() {
    return this.numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public String getTitular() {
    return this.titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public BigDecimal getSaldo() {
    return this.saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }
}