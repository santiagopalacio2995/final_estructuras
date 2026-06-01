public class EstudianteIngenieria extends Persona {

    private int    semestre;
    private double promedio;
    private String serialEquipo;

    public EstudianteIngenieria() {}

    public EstudianteIngenieria(String cedula, String nombre, String apellido,String telefono, int semestre, double promedio, String serialEquipo) {
        super(cedula, nombre, apellido, telefono);
        this.semestre     = semestre;
        this.promedio     = promedio;
        this.serialEquipo = serialEquipo;
    }

    public int    getSemestre()         { return semestre; }
    public double getPromedio()         { return promedio; }
    public String getSerialEquipo()     { return serialEquipo; }

    public void setSemestre(int s)        { this.semestre = s; }
    public void setPromedio(double p)     { this.promedio = p; }
    public void setSerialEquipo(String s) { this.serialEquipo = s; }

    @Override
    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("Cedula:        " + getCedula());
        System.out.println("Nombre:        " + getNombre() + " " + getApellido());
        System.out.println("Telefono:      " + getTelefono());
        System.out.println("Semestre:      " + semestre);
        System.out.println("Promedio:      " + promedio);
        System.out.println("Serial equipo: " + serialEquipo);
        System.out.println("------------------------------");
    }
}
