/**
 * Árbol Binario de Búsqueda para almacenar médicos de la clínica.
 * El criterio de orden es el código del médico.
 */
public class BST_Medicos {

    private NodoMedico raiz;

    /**
     * Inserta un médico en el árbol
     */
    public void insertar(Medico m) {
        raiz = insertarRec(raiz, m);
    }

    private NodoMedico insertarRec(NodoMedico n, Medico m) {

        if (n == null)
            return new NodoMedico(m);

        if (m.codigo < n.dato.codigo)
            n.izq = insertarRec(n.izq, m);
        else
            n.der = insertarRec(n.der, m);

        return n;
    }

    /**
     * Busca un médico por código
     */
    public Medico buscar(int codigo) {
        return buscarRec(raiz, codigo);
    }

    private Medico buscarRec(NodoMedico n, int codigo) {

        if (n == null)
            return null;

        if (codigo == n.dato.codigo)
            return n.dato;

        if (codigo < n.dato.codigo)
            return buscarRec(n.izq, codigo);
        else
            return buscarRec(n.der, codigo);
    }

    /**
     * Elimina un médico del árbol
     */
    public void eliminar(int codigo) {
        raiz = eliminarRec(raiz, codigo);
    }

    private NodoMedico eliminarRec(NodoMedico n, int codigo) {

        if (n == null)
            return null;

        if (codigo < n.dato.codigo)
            n.izq = eliminarRec(n.izq, codigo);

        else if (codigo > n.dato.codigo)
            n.der = eliminarRec(n.der, codigo);

        else {

            if (n.izq == null)
                return n.der;

            if (n.der == null)
                return n.izq;

            NodoMedico min = minimoNodo(n.der);
            n.dato = min.dato;
            n.der = eliminarRec(n.der, min.dato.codigo);
        }

        return n;
    }

    /**
     * Encuentra el nodo mínimo
     */
    private NodoMedico minimoNodo(NodoMedico n) {

        while (n.izq != null)
            n = n.izq;

        return n;
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoMedico n) {

        if (n != null) {
            inOrdenRec(n.izq);
            System.out.println(n.dato);
            inOrdenRec(n.der);
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
    }

    private void preOrdenRec(NodoMedico n) {

        if (n != null) {
            System.out.println(n.dato);
            preOrdenRec(n.izq);
            preOrdenRec(n.der);
        }
    }

    public void postOrden() {
        postOrdenRec(raiz);
    }

    private void postOrdenRec(NodoMedico n) {

        if (n != null) {
            postOrdenRec(n.izq);
            postOrdenRec(n.der);
            System.out.println(n.dato);
        }
    }

    /**
     * Calcula la altura del árbol
     */
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(NodoMedico n) {

        if (n == null)
            return -1;

        int izq = alturaRec(n.izq);
        int der = alturaRec(n.der);

        return 1 + Math.max(izq, der);
    }

    /*
     * Complejidad:
     * 
     * Promedio → O(log n)
     * 
     * Peor caso → O(n)
     * 
     * Si los códigos se insertan en orden ascendente
     * el árbol se vuelve degenerado (como una lista).
     */
}