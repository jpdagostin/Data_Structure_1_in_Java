public class Lista<T> {

    private Node<T> head;
    private Node<T> cauda;
    private int size = 0;

    public void addHead(T elemento){
        Node<T> no = new Node<T>(elemento);
        no.setElemento(elemento);
        no.setNext(head);
        head = no;
    }

    public void addCauda(T elemento){
        Node<T> no = new Node<T>(elemento);
        if(size == 0){
            this.head = no;
        }else{
            this.cauda.setNext(no);
        }
        this.cauda = no;
        this.size++;
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString(){
        StringBuffer sbuffer = new StringBuffer();//não sobrecarrega na hora de imprimir uma lista
        sbuffer.append("[");

        Node firstElement = head;
        while(firstElement != null){
            sbuffer.append(firstElement.getElemento()+ " ");
            firstElement = firstElement.getNext();
        }
        sbuffer.append("]");
        return sbuffer.toString();
    }
    
}
