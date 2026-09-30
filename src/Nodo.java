public class Nodo {

    private char dato;
    private Nodo siguiente;
    private Nodo anterior;
    private Nodo repetido;

    public Nodo(char c) {
        this.siguiente = null;
        this.anterior = null;
        this.repetido = null;
        this.dato = c;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getRepetido() {
        return repetido;
    }

    public void setRepetido(Nodo repetido) {
        this.repetido = repetido;
    }
}//Nodo

