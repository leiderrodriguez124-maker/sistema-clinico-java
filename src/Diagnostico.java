public class Diagnostico {

    String fecha;
    String diagnostico;
    String medicamento;
    String medico;

    public Diagnostico(String fecha, String diagnostico, String medicamento, String medico) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
        this.medico = medico;
    }

    public String toString() {
        return fecha + " - " + diagnostico + " - Medicamento: " + medicamento + " - Médico: " + medico;
    }
}