public class Paciente {

    String documento;
    String nombre;
    String fechaIngreso;
    int triage;
    String motivo;

    public Paciente(String documento, String nombre, String fechaIngreso, int triage, String motivo) {
        this.documento = documento;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.triage = triage;
        this.motivo = motivo;
    }

    public String toString() {
        return nombre + " | Documento: " + documento + " | Triage: " + triage + " | Motivo: " + motivo;
    }
}