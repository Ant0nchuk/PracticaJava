public class Curso {

    //Atributos
    private String nombre;
    private Boolean estaHabilitado;
    private String descripcion;
    private Alumno alumnos;


    //Constructores
    public Curso(String nombre, Boolean estaHabilitado, String descripcion, Alumno alumnos) {
        this.nombre = nombre;
        this.estaHabilitado = estaHabilitado;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }

    public Curso() {
    }




    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(Boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }


    
}
