package tiendaelectronica;

public class Tableta extends ProductoElectronico {
    private double tamanoPantalla;
    private String resolucionPantalla;

    public Tableta(double precio, String marca, String modelo, double tamanoPantalla, String resolucionPantalla) {
        super(precio, marca, modelo);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucionPantalla = resolucionPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
}
