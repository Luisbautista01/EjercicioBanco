
public class Cuenta {

    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;


    public Cuenta (String nombreDelTitular, long numeroDeCuenta,double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldoDeCuenta = saldoDeCuenta;

    }

    public void setIngreso(double cantidad){
        saldoDeCuenta = saldoDeCuenta + cantidad;
    }

    public void setReintegro(double cantidad) {
        saldoDeCuenta = saldoDeCuenta - cantidad;
    }

    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "Titular: " + nombreDelTitular + ", Número de cuenta: " + numeroDeCuenta + ", Saldo: " + saldoDeCuenta;
    }

}