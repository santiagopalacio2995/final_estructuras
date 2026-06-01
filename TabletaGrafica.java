import java.util.Scanner;

public class TabletaGrafica extends Equipo {

    private String almacenamiento;
    private double peso;

    public TabletaGrafica() {}

    public TabletaGrafica(String serial, String marca, double tamanio, double precio, String almacenamiento, double peso) {
        super(serial, marca, tamanio, precio);
        this.almacenamiento = almacenamiento;
        this.peso           = peso;
    }

    public String getAlmacenamiento()       { return almacenamiento; }
    public double getPeso()                 { return peso; }
    public void setAlmacenamiento(String a) { this.almacenamiento = a; }
    public void setPeso(double p)           { this.peso = p; }

    public static String elegirAlmacenamiento(Scanner sc) {
        Validaciones v = new Validaciones();
        System.out.println("Seleccione el almacenamiento:");
        System.out.println("  1. 256 GB");
        System.out.println("  2. 512 GB");
        System.out.println("  3. 1 TB");
        int opt = v.validarRango(1, 3, sc);
        switch (opt) {
            case 1:  return "256 GB";
            case 2:  return "512 GB";
            default: return "1 TB";
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("  [Tableta Grafica]");
        System.out.println("  Serial:         " + getSerial());
        System.out.println("  Marca:          " + getMarca());
        System.out.println("  Tamanio:        " + getTamanio() + " pulgadas");
        System.out.println("  Precio:         $" + getPrecio());
        System.out.println("  Almacenamiento: " + almacenamiento);
        System.out.println("  Peso:           " + peso + " kg");
        System.out.println("------------------------------");
    }
}
