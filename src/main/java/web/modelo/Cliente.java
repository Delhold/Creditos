package web.modelo;

public class Cliente {
    private String nombre;
    private String sexo;
    private int edad;
    private double sueldo;
    private double montoCredito;
    private int plazo;
    private double interes;
    private double pagoMensual;

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(double montoCredito) {
        this.montoCredito = montoCredito;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void calcularInteresYPago() {
        switch (this.plazo) {
            case 12:
                this.interes = 0.25;
                break;
            case 24:
                this.interes = 0.45;
                break;
            case 36:
                this.interes = 0.60;
                break;
            case 60:
                this.interes = 0.75;
                break;
        }
        double totalAPagar = this.montoCredito * (1 + this.interes);
        this.pagoMensual = totalAPagar / this.plazo;
    }
}

