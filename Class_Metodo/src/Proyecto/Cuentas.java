package Proyecto;

public class Cuentas {
      private double saldo;

    public Cuentas(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void abonar(double monto) {
        saldo += monto;
    }

    public void debitar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
