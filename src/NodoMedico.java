public class NodoMedico {

    Medico dato;
    NodoMedico izq;
    NodoMedico der;

    public NodoMedico(Medico dato) {
        this.dato = dato;
        izq = null;
        der = null;
    }
}