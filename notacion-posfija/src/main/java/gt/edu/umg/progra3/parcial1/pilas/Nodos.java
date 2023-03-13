package gt.edu.umg.progra3.parcial1.pilas;


public class Nodos {
    public String valor;
    public Nodos siguiente;

    public Nodos(String valor, Nodos cima){
        this.valor = valor;
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }

    public String getItem() {
        return valor;
    }
}
