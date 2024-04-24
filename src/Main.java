public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Luis",756900033,3000000);
        Cuenta cuenta2 = new Cuenta("Stefa",457400455,4000000);

        Banco banco = new Banco (cuenta1, cuenta2);
        banco.realizarTransferenciaEntreCuentas(20000, cuenta1,cuenta2);

    }
}