public class Banco {

    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void realizarTransferenciaEntreCuentas(double cantidad, Cuenta origen, Cuenta destino) {
        if (origen.getSaldoCuenta() >= cantidad) {
            origen.setReintegro(cantidad);
            destino.setIngreso(cantidad);
            System.out.println("Transferencia de " + cantidad + " realizada con éxito de la cuenta " +
                    origen.getDatosCuenta() + " a la cuenta " + destino.getDatosCuenta());
        } else {
            System.out.println("Fondos insuficientes en la cuenta. No se puede realizar la transferencia.");
        }
    }


}
