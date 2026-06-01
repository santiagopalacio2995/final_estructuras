import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void menuIngenieria(Scanner sc,LinkedList<EstudianteIngenieria> lista,Stack<EstudianteIngenieria> pila,Queue<EstudianteIngenieria> cola) {
        GestionIngenieria g = new GestionIngenieria();
        validaciones      v = new validaciones();
        boolean bandera = true;
        while (bandera) {
            System.out.println("\n ----- GESTION PRESTAMOS - INGENIERIA -----");
            System.out.println("1. Registrar prestamo");
            System.out.println("2. Modificar prestamo");
            System.out.println("3. Devolucion de equipo");
            System.out.println("4. Buscar por cedula");
            System.out.println("5. Buscar por serial");
            System.out.println("6. Ver lista de prestamos");
            System.out.println("7. Ver historial pila");
            System.out.println("8. Ver cola de atencion");
            System.out.println("9. Volver al menu principal");
            System.out.print("Opcion: ");
            int opt = v.validarRango(1, 9, sc);
            switch (opt) {
                case 1: g.registrarPrestamo(lista, pila, cola, sc); break;
                case 2: g.modificar(lista, sc);                      break;
                case 3: g.devolver(lista, cola, sc);                 break;
                case 4: g.buscar(lista, sc);                         break;
                case 5: g.buscar(lista, sc, true);                   break;
                case 6: g.mostrarLista(lista);                       break;
                case 7: g.mostrarPila(pila);                         break;
                case 8: g.mostrarCola(cola);                         break;
                case 9: bandera = false;                             break;
            }
        }
    }

    public static void menuDiseno(Scanner sc,
                                  LinkedList<EstudianteDiseno> lista,
                                  Stack<EstudianteDiseno> pila,
                                  Queue<EstudianteDiseno> cola) {
        GestionDiseno g = new GestionDiseno();
        validaciones  v = new validaciones();
        boolean bandera = true;
        while (bandera) {
            System.out.println("\n ---- GESTION PRESTAMOS - DISENO ----");
            System.out.println("1. Registrar prestamo");
            System.out.println("2. Modificar prestamo");
            System.out.println("3. Devolucion de equipo");
            System.out.println("4. Buscar por cedula");
            System.out.println("5. Buscar por serial");
            System.out.println("6. Ver lista de prestamos");
            System.out.println("7. Ver historial pila");
            System.out.println("8. Ver cola de atencion");
            System.out.println("9. Volver al menu principal");
            System.out.print("Opcion: ");
            int opt = v.validarRango(1, 9, sc);
            switch (opt) {
                case 1: g.registrarPrestamo(lista, pila, cola, sc); break;
                case 2: g.modificar(lista, sc);                      break;
                case 3: g.devolver(lista, cola, sc);                 break;
                case 4: g.buscar(lista, sc);                         break;
                case 5: g.buscar(lista, sc, true);                   break;
                case 6: g.mostrarLista(lista);                       break;
                case 7: g.mostrarPila(pila);                         break;
                case 8: g.mostrarCola(cola);                         break;
                case 9: bandera = false;                             break;
            }
        }
    }

    public static void imprimirInventario(LinkedList<EstudianteIngenieria> listaIng, LinkedList<EstudianteDiseno>     listaDis) {
        System.out.println("\n -------------------------------------");
        System.out.println(" ---- INVENTARIO TOTAL DE PRESTAMOS ----");
        System.out.println("-------------------------------------");
        System.out.println("\n--- Estudiantes de Ingenieria (" + listaIng.size() + ") ---");
        if (listaIng.isEmpty()) System.out.println("  Sin registros.");
        else for (EstudianteIngenieria e : listaIng) e.mostrarDatos();
        System.out.println("\n--- Estudiantes de Diseno (" + listaDis.size() + ") ---");
        if (listaDis.isEmpty()) System.out.println("  Sin registros.");
        else for (EstudianteDiseno e : listaDis) e.mostrarDatos();
        System.out.println("\nTotal de prestamos activos: " + (listaIng.size() + listaDis.size()));
    }
}
