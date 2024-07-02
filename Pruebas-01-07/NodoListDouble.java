public class Nodo<E> {
   private E data;
   private Nodo<E> siguiente;
   private Nodo<E> anterior;

   public Nodo(E data) {
      this.data = data;
      this.siguiente = null;
      this.anterior = null;
   }

   public Nodo(E data, Nodo<K, V> sig, Nodo<K, V> ant) {
      this.data = data;
      this.siguiente = sig;
      this.anterior = ant;
   }

   public E getData() {
      return data;
   }

   public void setData(E d) {
      this.data = d;
   }

   public Nodo<E> getSiguiente() {
      return siguiente;
   }

   public void setSiguiente(Nodo<E> sig) {
      this.siguiente = sig;
   }

   public Nodo<E> getAnterior() {
      return anterior;
   }

   public void setAnterior(Nodo<E> ant) {
      this.anterior = ant;
   }
}