import java.util.Scanner;

public class ComputadorPortatil extends Equipo {

    private String sistemaOperativo;
    private String procesador;

    public ComputadorPortatil() {}

    public ComputadorPortatil(String serial, String marca, double tamanio,double precio, String sistemaOperativo, String procesador) {
        super(serial, marca, tamanio, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador       = procesador;
    }

    public String getSistemaOperativo()        { return sistemaOperativo; }
    public String getProcesador()              { return procesador; }
    public void setSistemaOperativo(String so) { this.sistemaOperativo = so; }
    public void setProcesador(String p)        { this.procesador = p; }

    public static String elegirSistemaOperativo(Scanner sc) {
        validaciones v = new validaciones();
        System.out.println("Seleccione el Sistema Operativo:");
        System.out.println("  1. Windows 7");
        System.out.println("  2. Windows 10");
        System.out.println("  3. Windows 11");
        int opt = v.validarRango(1, 3, sc);
        switch (opt) {
            case 1:  return "Windows 7";
            case 2:  return "Windows 10";
            default: return "Windows 11";
        }
    }

    public static String elegirProcesador(Scanner sc) {
        validaciones v = new validaciones();
        System.out.println("Seleccione el Procesador:");
        System.out.println("  1. AMD Ryzen");
        System.out.println("  2. Intel Core i5");
        return v.validarRango(1, 2, sc) == 1 ? "AMD Ryzen" : "Intel Core i5";
    }

    @Override
    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("  [Computador Portatil]");
        System.out.println("  Serial:  " + getSerial());
        System.out.println("  Marca:   " + getMarca());
        System.out.println("  Tamanio: " + getTamanio() + " pulgadas");
        System.out.println("  Precio:  $" + getPrecio());
        System.out.println("  S.O.:    " + sistemaOperativo);
        System.out.println("  Proc:    " + procesador);
        System.out.println("------------------------------");
    }
}