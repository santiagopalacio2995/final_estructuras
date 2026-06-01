import java.util.LinkedList;

public class Inventario {

    public void imprimirInventarioTotal(LinkedList<EstudianteIngenieria> listaIngenieria,
                                        LinkedList<EstudianteDiseno> listaDiseno) {
        System.out.println("==============================");
        System.out.println("      INVENTARIO TOTAL        ");
        System.out.println("==============================");

        System.out.println("\n--- ESTUDIANTES DE INGENIERIA (" + listaIngenieria.size() + " registros) ---");
        if (listaIngenieria.isEmpty()) {
            System.out.println("Sin registros");
        } else {
            for (EstudianteIngenieria o : listaIngenieria) {
                o.mostrarDatos();
            }
        }

        System.out.println("\n--- ESTUDIANTES DE DISENO (" + listaDiseno.size() + " registros) ---");
        if (listaDiseno.isEmpty()) {
            System.out.println("Sin registros");
        } else {
            for (EstudianteDiseno o : listaDiseno) {
                o.mostrarDatos();
            }
        }

        System.out.println("==============================");
    }
}
