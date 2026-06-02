import java.util.LinkedList;
import java.util.Scanner;

public class GestionEquipos {

    private final validaciones v = new validaciones();

    public void registrarComputador(LinkedList<ComputadorPortatil> lista, Scanner sc) {
        ComputadorPortatil c = new ComputadorPortatil();

        System.out.print("Serial del computador: ");
        String serial = sc.nextLine().trim();
        if (serialExisteComputador(lista, serial)) {
            System.out.println("Error: ya existe un computador con ese serial.");
            return;
        }
        c.setSerial(serial);

        System.out.print("Marca: ");
        c.setMarca(v.validarSoloLetras("marca", sc));

        System.out.print("Tamanio en pulgadas (ej: 15.6): ");
        c.setTamanio(v.validarFloat(sc));

        System.out.print("Precio: ");
        c.setPrecio(v.validarFloat(sc));

        c.setSistemaOperativo(ComputadorPortatil.elegirSistemaOperativo(sc));
        c.setProcesador(ComputadorPortatil.elegirProcesador(sc));

        lista.add(c);
        System.out.println("Computador registrado correctamente.");
    }

    public void registrarTableta(LinkedList<TabletaGrafica> lista, Scanner sc) {
        TabletaGrafica t = new TabletaGrafica();

        System.out.print("Serial de la tableta: ");
        String serial = sc.nextLine().trim();
        if (serialExisteTableta(lista, serial)) {
            System.out.println("Error: ya existe una tableta con ese serial.");
            return;
        }
        t.setSerial(serial);

        System.out.print("Marca: ");
        t.setMarca(v.validarSoloLetras("marca", sc));

        System.out.print("Tamanio en pulgadas (ej: 10.5): ");
        t.setTamanio(v.validarFloat(sc));

        System.out.print("Precio: ");
        t.setPrecio(v.validarFloat(sc));

        t.setAlmacenamiento(TabletaGrafica.elegirAlmacenamiento(sc));

        System.out.print("Peso en kg (ej: 0.6): ");
        t.setPeso(v.validarFloat(sc));

        lista.add(t);
        System.out.println("Tableta registrada correctamente.");
    }

    public void mostrarComputadores(LinkedList<ComputadorPortatil> lista) {
        if (lista.isEmpty()) { System.out.println("No hay computadores registrados."); return; }
        System.out.println("=== COMPUTADORES PORTATILES (" + lista.size() + ") ===");
        for (ComputadorPortatil c : lista) c.mostrarDatos();
    }

    public void mostrarTabletas(LinkedList<TabletaGrafica> lista) {
        if (lista.isEmpty()) { System.out.println("No hay tabletas registradas."); return; }
        System.out.println("=== TABLETAS GRAFICAS (" + lista.size() + ") ===");
        for (TabletaGrafica t : lista) t.mostrarDatos();
    }

    public boolean serialExisteComputador(LinkedList<ComputadorPortatil> lista, String serial) {
        for (ComputadorPortatil c : lista)
            if (c.getSerial().equalsIgnoreCase(serial)) return true;
        return false;
    }

    public boolean serialExisteTableta(LinkedList<TabletaGrafica> lista, String serial) {
        for (TabletaGrafica t : lista)
            if (t.getSerial().equalsIgnoreCase(serial)) return true;
        return false;
    }

    public boolean serialDisponible(LinkedList<ComputadorPortatil> computadores,
                                    LinkedList<TabletaGrafica> tabletas,
                                    String serial) {
        for (ComputadorPortatil c : computadores)
            if (c.getSerial().equalsIgnoreCase(serial)) return true;
        for (TabletaGrafica t : tabletas)
            if (t.getSerial().equalsIgnoreCase(serial)) return true;
        return false;
    }
}
