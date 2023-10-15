package net.datastructures;

import net.datastructures.Node;

/** Lista simplesmente encadeada */
public class ListaSimplesmenteEncadeada<E> {
    // nodo cabeça da lista
    protected Node cauda;
    protected long size;

    public ListaSimplesmenteEncadeada(){
        cauda = null;
        size = 0;
    }

    /**
     * Adiciona uma novo elemento na cabeça da lista, deslocando a cabeça atual;
     * @param elemento Elemento a ser inserido
     */
    public void addNewNode( E elemento){
        Node n  = new Node();
        n.setElement(elemento);
        n.setNext(n);

        if(this.size == 0){
            this.cauda = null;
        }else{
            cauda.setNext(n);
        }
        this.cauda = n;
        this.size++;
    }

    /**
     * Remove o nó da cabeça da lista
     */
 /*    public void removeNode(){
        Node n = this.cauda;
        this.cauda = this.cauda.getNext();
        n = null;
        this.size--;
    }

    public void removeAll(){
        Node n;

        while (this.cauda != null){
            this.removeNode();
        }

    }
 */

    @Override
    public String toString() {
        String itemsLista = "";
        Node i = this.cauda;
        while (i != null) {
            itemsLista += i.getElement() + " \n";
            i = i.getNext();
        }
        return "ListaSimplesmenteEncadeada {" +
                "cauda=" + cauda +
                ", size=" + size +
                ",\nElementos da lista:  \n{\n" + itemsLista +
                '}';


    }



    public static void main(String[] args ){

    }

}




