public class NodoDiagnostico {

    Diagnostico dato;
    NodoDiagnostico siguiente;

    public NodoDiagnostico(Diagnostico dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}