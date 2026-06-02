import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validaciones v = new validaciones();

        LinkedList<ComputadorPortatil> computadores = new LinkedList<>();
        LinkedList<TabletaGrafica>     tabletas     = new LinkedList<>();

        LinkedList<EstudianteIngenieria> listaIng = new LinkedList<>();
        Stack<EstudianteIngenieria>      pilaIng  = new Stack<>();
        Queue<EstudianteIngenieria>      colaIng  = new LinkedList<>();

        LinkedList<EstudianteDiseno> listaDis = new LinkedList<>();
        Stack<EstudianteDiseno>      pilaDis  = new Stack<>();
        Queue<EstudianteDiseno>      colaDis  = new LinkedList<>();


        boolean bandera = true;
        while (bandera) {
            System.out.println("\n ------------------------------------------");
            System.out.println(" GESTION PRESTAMO EQUIPOS - San Juan de Dios ");
            System.out.println("---------------------------------------------");
            System.out.println("1. Gestionar equipos");
            System.out.println("2. Estudiantes de Ingenieria");
            System.out.println("3. Estudiantes de Diseno");
            System.out.println("4. Imprimir inventario total");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            int opt = v.validarRango(1, 4, sc);
            switch (opt) {
                case 1: Menu.menuEquipos(sc, computadores, tabletas);                               break;
                case 2: Menu.menuIngenieria(sc, listaIng, pilaIng, colaIng, computadores, tabletas); break;
                case 3: Menu.menuDiseno(sc, listaDis, pilaDis, colaDis, computadores, tabletas);     break;
                case 4: Menu.imprimirInventario(listaIng, listaDis, computadores, tabletas);         break;
                case 5:
                    System.out.println("Hasta luego.");
                    bandera = false;
                    break;
            }
        }
        sc.close();
    }
}