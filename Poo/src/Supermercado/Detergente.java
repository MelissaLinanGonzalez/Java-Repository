package Supermercado;

public class Detergente implements ConDescuento, EsLiquido{

    private String marca;
    private double precio;
    private double descuento;
    private double volumen;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        descuento = des;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - descuento;
    }

    @Override
    public void setVolumen(double V) {
        volumen = V;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
    }

    @Override
    public String getTipoEnvase() {
        return "";
    }
}
