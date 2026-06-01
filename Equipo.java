public abstract class Equipo {

    private String serial;
    private String marca;
    private double tamanio;
    private double precio;

    public Equipo() {}

    public Equipo(String serial, String marca, double tamanio, double precio) {
        this.serial  = serial;
        this.marca   = marca;
        this.tamanio = tamanio;
        this.precio  = precio;
    }

    public String getSerial()  { return serial; }
    public String getMarca()   { return marca; }
    public double getTamanio() { return tamanio; }
    public double getPrecio()  { return precio; }

    public void setSerial(String serial)  { this.serial = serial; }
    public void setMarca(String marca)    { this.marca = marca; }
    public void setTamanio(double t)      { this.tamanio = t; }
    public void setPrecio(double p)       { this.precio = p; }

    public abstract void mostrarDatos();
}

