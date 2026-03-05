public class Medico {

    int codigo;
    String nombre;
    String especialidad;
    String turno;
    int pacientesAtendidos;

    public Medico(int codigo, String nombre, String especialidad, String turno, int pacientesAtendidos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.turno = turno;
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public String toString() {
        return codigo + " - " + nombre + " - " + especialidad + " - Turno: " + turno;
    }
}