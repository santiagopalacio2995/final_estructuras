public abstract class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {}

    public Persona(String cedula, String nombre, String apellido, String telefono) {
        this.cedula   = cedula;
        this.nombre   = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getCedula()   { return cedula; }
    public String getNombre()   { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }

    public void setCedula(String cedula)     { this.cedula = cedula; }
    public void setNombre(String nombre)     { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public abstract void mostrarDatos();
}
