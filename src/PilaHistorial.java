public class PilaHistorial {

    private NodoDiagnostico tope;
    private int tamanio;

    public void push(Diagnostico d) {

        NodoDiagnostico nuevo = new NodoDiagnostico(d);

        nuevo.siguiente = tope;
        tope = nuevo;

        tamanio++;
    }

    public Diagnostico pop() {

        if (isEmpty()) {
            System.out.println("Historial vacío");
            return null;
        }

        Diagnostico d = tope.dato;
        tope = tope.siguiente;

        tamanio--;

        return d;
    }

    public Diagnostico peek() {

        if (isEmpty())
            return null;

        return tope.dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void mostrarHistorial() {

        NodoDiagnostico aux = tope;

        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }

    /*
    Se usa pila porque el diagnóstico más reciente
    debe consultarse primero (LIFO).
    */
}