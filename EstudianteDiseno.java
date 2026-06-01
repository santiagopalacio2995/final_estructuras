public class EstudianteDiseno extends Persona {

    private String modalidad;
    private int    cantidadAsignaturas;
    private String serialEquipo;

    public EstudianteDiseno() {}

    public EstudianteDiseno(String cedula, String nombre, String apellido,String telefono, String modalidad,int cantidadAsignaturas, String serialEquipo) {
        super(cedula, nombre, apellido, telefono);
        this.modalidad           = modalidad;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serialEquipo        = serialEquipo;
    }

    public String getModalidad()           { return modalidad; }
    public int    getCantidadAsignaturas() { return cantidadAsignaturas; }
    public String getSerialEquipo()        { return serialEquipo; }

    public void setModalidad(String m)        { this.modalidad = m; }
    public void setCantidadAsignaturas(int c) { this.cantidadAsignaturas = c; }
    public void setSerialEquipo(String s)     { this.serialEquipo = s; }

    @Override
    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("Cedula:        " + getCedula());
        System.out.println("Nombre:        " + getNombre() + " " + getApellido());
        System.out.println("Telefono:      " + getTelefono());
        System.out.println("Modalidad:     " + modalidad);
        System.out.println("Asignaturas:   " + cantidadAsignaturas);
        System.out.println("Serial equipo: " + serialEquipo);
        System.out.println("------------------------------");
    }
}
