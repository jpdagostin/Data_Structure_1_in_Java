public class Node<T> {

    private T elemento;
    private Node<T> next;

    public Node(T elemento) {
        this.elemento = elemento;
        this.next = null;
    }

    public Node(T elemento, Node<T> next) {
        this.elemento = elemento;
        this.next = next;
    }


    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

    //@Override
    //public String toString() {
        //StringBuffer buffer = new StringBuffer();
        //buffer.append("elemento = [ ").append(elemento).append(", proximo = ").append(next).append(" ]").toString();
        //return "Node [elemento=" + elemento + ", next=" + next + "]";
        //return buffer.toString();
    //}

    
}
