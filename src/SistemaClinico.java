public class SistemaClinico {

    public static void main(String[] args) {

        ColaPacientes cola = new ColaPacientes();

        cola.enqueue(new Paciente("101", "Juan", "2026-03-05", 3, "Dolor cabeza"));
        cola.enqueue(new Paciente("102", "Maria", "2026-03-05", 2, "Fiebre"));
        cola.enqueue(new Paciente("103", "Carlos", "2026-03-05", 4, "Dolor abdominal"));
        cola.enqueue(new Paciente("104", "Ana", "2026-03-05", 1, "Accidente"));
        cola.enqueue(new Paciente("105", "Pedro", "2026-03-05", 5, "Gripe"));
        cola.enqueue(new Paciente("106", "Laura", "2026-03-05", 3, "Dolor espalda"));

        System.out.println("Pacientes atendidos:");

        for (int i = 0; i < 3; i++) {
            Paciente p = cola.dequeue();
            System.out.println(p);
        }

        cola.mostrarCola();

        PilaHistorial historial = new PilaHistorial();

        historial.push(new Diagnostico("01/03", "Gripe", "Acetaminofen", "Dr Lopez"));
        historial.push(new Diagnostico("02/03", "Migraña", "Ibuprofeno", "Dr Diaz"));
        historial.push(new Diagnostico("03/03", "Infeccion", "Amoxicilina", "Dr Ruiz"));
        historial.push(new Diagnostico("04/03", "Fatiga", "Vitaminas", "Dr Perez"));

        System.out.println("\nUltimo diagnostico:");
        System.out.println(historial.peek());

        historial.pop();

        System.out.println("\nHistorial actual:");
        historial.mostrarHistorial();

        BST_Medicos bst = new BST_Medicos();

        bst.insertar(new Medico(50, "Dr Lopez", "General", "mañana", 20));
        bst.insertar(new Medico(30, "Dr Ruiz", "Pediatria", "tarde", 15));
        bst.insertar(new Medico(70, "Dr Diaz", "Neurologia", "mañana", 12));
        bst.insertar(new Medico(20, "Dr Perez", "Traumatologia", "noche", 10));
        bst.insertar(new Medico(40, "Dr Castro", "Cardiologia", "mañana", 18));
        bst.insertar(new Medico(60, "Dr Vega", "Dermatologia", "tarde", 9));
        bst.insertar(new Medico(80, "Dr Torres", "Cirugia", "noche", 22));
        bst.insertar(new Medico(10, "Dr Ramirez", "General", "mañana", 5));

        System.out.println("\nBusqueda medico codigo 40:");
        System.out.println(bst.buscar(40));

        System.out.println("\nRecorrido InOrden:");
        bst.inOrden();

        System.out.println("\nAltura del arbol:");
        System.out.println(bst.altura());
        System.out.println("\nRecorrido PreOrden:");
        bst.preOrden();

        System.out.println("\nRecorrido PostOrden:");
        bst.postOrden();

        System.out.println("\nEliminar nodo hoja (10)");
        bst.eliminar(10);
        bst.inOrden();

        System.out.println("\nEliminar nodo con un hijo (20)");
        bst.eliminar(20);
        bst.inOrden();

        System.out.println("\nEliminar nodo con dos hijos (50)");
        bst.eliminar(50);
        bst.inOrden();

        System.out.println("\nAltura del árbol después de eliminaciones:");
        System.out.println(bst.altura());
    }
}