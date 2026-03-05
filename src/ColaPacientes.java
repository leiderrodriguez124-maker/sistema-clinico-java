public class ColaPacientes {

    private NodoPaciente frente;
    private NodoPaciente ultimo;
    private int tamanio;

    public ColaPacientes() {
        frente = null;
        ultimo = null;
        tamanio = 0;
    }

    public void enqueue(Paciente p) {

        NodoPaciente nuevo = new NodoPaciente(p);

        if (isEmpty()) {
            frente = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        tamanio++;
    }

    public Paciente dequeue() {

        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }

        Paciente p = frente.dato;
        frente = frente.siguiente;
        tamanio--;

        return p;
    }

    public Paciente peek() {

        if (isEmpty())
            return null;

        return frente.dato;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void mostrarCola() {

        NodoPaciente aux = frente;

        System.out.println("Estado de la cola:");

        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }

    /*
    Complejidad:

    enqueue() -> O(1)
    dequeue() -> O(1)

    porque se insertan y eliminan nodos sin recorrer la lista.
    */
}