import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();

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
            System.out.println("1. Estudiantes de Ingenieria");
            System.out.println("2. Estudiantes de Diseno");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            int opt = v.validarRango(1, 4, sc);
            switch (opt) {
                case 1: Menu.menuIngenieria(sc, listaIng, pilaIng, colaIng); break;
                case 2: Menu.menuDiseno(sc, listaDis, pilaDis, colaDis);     break;
                case 3: Menu.imprimirInventario(listaIng, listaDis);         break;
                case 4:
                    System.out.println("Hasta luego.");
                    bandera = false;
                    break;
            }
        }
        sc.close();
    }
}