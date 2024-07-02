public class Nodo<K, V> {
   private K data;
   private V codigo;
   private Nodo<K, V> siguiente;
   private Nodo<K, V> anterior;

   public Nodo(K data, V codigo) {
      this.data = data;
      this.codigo = codigo;
      this.siguiente = null;
      this.anterior = null;
   }

   public Nodo(K data, Nodo<K, V> sig, Nodo<K, V> ant) {
      this.data = data;
      this.siguiente = sig;
      this.anterior = ant;
   }

   public K getData() {
      return data;
   }

   public void setData(K d) {
      this.data = d;
   }

   public V getCodigo() {
      return codigo;
   }

   public void setCodigo(V codigo) {
      this.codigo = codigo;
   }

   public Nodo<K, V> getSiguiente() {
      return siguiente;
   }

   public void setSiguiente(Nodo<K, V> sig) {
      this.siguiente = sig;
   }

   public Nodo<K, V> getAnterior() {
      return anterior;
   }

   public void setAnterior(Nodo<K, V> ant) {
      this.anterior = ant;
   }
}