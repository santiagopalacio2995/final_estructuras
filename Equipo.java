public abstract class Equipo {

    private String serial;
    private String marca;
    private float  tamanio;
    private float  precio;

    public Equipo() {}

    public Equipo(String serial, String marca, float tamanio, float precio) {
        this.serial  = serial;
        this.marca   = marca;
        this.tamanio = tamanio;
        this.precio  = precio;
    }

    public String getSerial()  { return serial; }
    public String getMarca()   { return marca; }
    public float  getTamanio() { return tamanio; }
    public float  getPrecio()  { return precio; }

    public void setSerial(String serial)  { this.serial = serial; }
    public void setMarca(String marca)    { this.marca = marca; }
    public void setTamanio(float t)       { this.tamanio = t; }
    public void setPrecio(float p)        { this.precio = p; }

    public abstract void mostrarDatos();
}
