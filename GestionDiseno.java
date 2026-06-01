import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GestionDiseno {

    private final Validaciones v = new Validaciones();

    public void registrarPrestamo(LinkedList<EstudianteDiseno> lista,Stack<EstudianteDiseno> pila,Queue<EstudianteDiseno> cola,Scanner sc) {
        System.out.print("Cedula: ");
        String cedula = v.validarCedula(sc);

        for (EstudianteDiseno e : lista) {
            if (e.getCedula().equals(cedula) && e.getSerialEquipo() != null && !e.getSerialEquipo().isEmpty()) {
                System.out.println("Error: el estudiante ya tiene un equipo asignado. Debe devolver primero.");
                return;
            }
        }

        EstudianteDiseno o = new EstudianteDiseno();
        o.setCedula(cedula);

        System.out.print("Nombre: ");
        o.setNombre(v.validarSoloLetras("nombre", sc));

        System.out.print("Apellido: ");
        o.setApellido(v.validarSoloLetras("apellido", sc));

        System.out.print("Telefono: ");
        o.setTelefono(v.validarTelefono(sc));

        System.out.println("Modalidad de estudio:");
        System.out.println("  1. Virtual");
        System.out.println("  2. Presencial");
        o.setModalidad(v.validarRango(1, 2, sc) == 1 ? "Virtual" : "Presencial");

        System.out.print("Cantidad de asignaturas: ");
        o.setCantidadAsignaturas(v.validarRango(1, 30, sc));

        System.out.print("Serial del equipo: ");
        o.setSerialEquipo(sc.nextLine().trim());

        lista.add(o);
        pila.push(o);
        cola.offer(o);

        System.out.println("Prestamo registrado correctamente.");
    }

    public void modificar(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        System.out.print("Ingrese la cedula a modificar: ");
        String cedula = v.validarCedula(sc);
        boolean encontrado = false;
        for (EstudianteDiseno o : lista) {
            if (o.getCedula().equals(cedula)) {
                encontrado = true;
                System.out.print("Nuevo nombre: ");
                o.setNombre(v.validarSoloLetras("nombre", sc));
                System.out.print("Nuevo apellido: ");
                o.setApellido(v.validarSoloLetras("apellido", sc));
                System.out.print("Nuevo telefono: ");
                o.setTelefono(v.validarTelefono(sc));
                System.out.println("Nueva modalidad:");
                System.out.println("  1. Virtual");
                System.out.println("  2. Presencial");
                o.setModalidad(v.validarRango(1, 2, sc) == 1 ? "Virtual" : "Presencial");
                System.out.print("Nueva cantidad de asignaturas: ");
                o.setCantidadAsignaturas(v.validarRango(1, 30, sc));
                System.out.println("Registro actualizado.");
            }
        }
        if (!encontrado) System.out.println("No se encontro ningun registro con esa cedula.");
    }

    public void devolver(LinkedList<EstudianteDiseno> lista,
                         Queue<EstudianteDiseno> cola,
                         Scanner sc) {
        System.out.print("Cedula del estudiante que devuelve el equipo: ");
        String cedula = v.validarCedula(sc);
        boolean eliminado = lista.removeIf(o -> o.getCedula().equals(cedula));
        cola.removeIf(o -> o.getCedula().equals(cedula));
        System.out.println(eliminado ? "Devolucion registrada y prestamo eliminado." : "No se encontro ningun registro.");
    }

    public void buscar(LinkedList<EstudianteDiseno> lista, Scanner sc) {
        System.out.print("Cedula a buscar: ");
        String cedula = v.validarCedula(sc);
        boolean encontrado = false;
        for (EstudianteDiseno o : lista) {
            if (o.getCedula().equals(cedula)) { o.mostrarDatos(); encontrado = true; }
        }
        if (!encontrado) System.out.println("No se encontro ningun registro.");
    }

    public void buscar(LinkedList<EstudianteDiseno> lista, Scanner sc, boolean porSerial) {
        System.out.print("Serial del equipo: ");
        String serial = sc.nextLine().trim();
        boolean encontrado = false;
        for (EstudianteDiseno o : lista) {
            if (o.getSerialEquipo().equalsIgnoreCase(serial)) { o.mostrarDatos(); encontrado = true; }
        }
        if (!encontrado) System.out.println("No se encontro ningun registro.");
    }

    public void mostrarLista(LinkedList<EstudianteDiseno> lista) {
        if (lista.isEmpty()) { System.out.println("La lista esta vacia."); return; }
        System.out.println("=== LISTA - Diseno (" + lista.size() + " registros) ===");
        for (EstudianteDiseno o : lista) o.mostrarDatos();
    }

    public void mostrarPila(Stack<EstudianteDiseno> pila) {
        if (pila.isEmpty()) { System.out.println("La pila esta vacia."); return; }
        System.out.println("=== HISTORIAL PILA - Diseno ===");
        for (int i = pila.size() - 1; i >= 0; i--) pila.get(i).mostrarDatos();
    }

    public void mostrarCola(Queue<EstudianteDiseno> cola) {
        if (cola.isEmpty()) { System.out.println("La cola esta vacia."); return; }
        System.out.println("=== COLA DE ATENCION - Diseno ===");
        for (EstudianteDiseno o : cola) o.mostrarDatos();
    }
}
