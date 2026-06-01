import java.util.Scanner;

public class validaciones {

    public int validarEntero(Scanner sc) {
        if (sc.hasNextInt()) {
            int valor = sc.nextInt();
            sc.nextLine();
            return valor;
        }
        System.out.println("Error: ingrese solo numeros enteros.");
        sc.nextLine();
        return validarEntero(sc);
    }

    public double validarDecimal(Scanner sc) {
        if (sc.hasNextDouble()) {
            double valor = sc.nextDouble();
            sc.nextLine();
            return valor;
        }
        System.out.println("Error: ingrese un numero decimal valido (ej: 4.5).");
        sc.nextLine();
        return validarDecimal(sc);
    }

    public int validarRango(int min, int max, Scanner sc) {
        int valor = validarEntero(sc);
        if (valor >= min && valor <= max) return valor;
        System.out.println("Error: ingrese un numero entre " + min + " y " + max + ".");
        return validarRango(min, max, sc);
    }

    public String validarCedula(Scanner sc) {
        String cedula = sc.nextLine().trim();
        if (cedula.matches("[0-9]{7,11}")) return cedula;
        System.out.println("Error: la cedula debe tener entre 7 y 11 digitos numericos.");
        return validarCedula(sc);
    }

    public String validarSoloLetras(String campo, Scanner sc) {
        String texto = sc.nextLine().trim();
        if (texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) return texto;
        System.out.println("Error: el campo '" + campo + "' solo admite letras, sin numeros ni caracteres especiales.");
        return validarSoloLetras(campo, sc);
    }

    public String validarTelefono(Scanner sc) {
        String tel = sc.nextLine().trim();
        if (tel.matches("[0-9]{7,15}")) return tel;
        System.out.println("Error: el telefono debe contener solo numeros (7 a 15 digitos).");
        return validarTelefono(sc);
    }

    public String validarSiNo(Scanner sc) {
        String opt = sc.nextLine().trim();
        if (opt.equalsIgnoreCase("S") || opt.equalsIgnoreCase("N")) return opt.toUpperCase();
        System.out.println("Error: ingrese solo S o N.");
        return validarSiNo(sc);
    }

    public String validarTexto(String campo, Scanner sc) {
        String texto = sc.nextLine().trim();
        if (texto.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+")) return texto;
        System.out.println("Error: el campo '" + campo + "' no permite caracteres especiales.");
        return validarTexto(campo, sc);
    }
}