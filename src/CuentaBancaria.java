
public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                System.out.println("No se puede retirar más de lo disponible.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}