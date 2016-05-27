//Se define la estructura del dato.

public class Nodo {

    public int dato;
    public Nodo liga;

    public Nodo(int dato) {
        this.dato = dato;
        this.liga = null;
    }

    public Nodo() {

    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
