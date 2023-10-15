package ListaEncadeada;

public class ListaEncadeada<T>{

    private Node<String> head;
    private Node<String> cauda;
    private int size = 0;

        public void push(String elemento){
            Node<String> no = new Node<String>(elemento);//declarando um novo nó, instanciando com o elemento da classe Node
            if(size == 0){
                this.head = no;
            }
            else{
                this.cauda.setNext(no);
            }
            this.cauda = no;
            this.size++;
        }

        public void pop(){
            if(head != null){

                Node no = this.head;
                this.head = this.head.getNext();
                no = null;
                this.size--;
                
            }
            else{
                //throw new ExceptionListaVazia(head);
                System.out.println("Lista vazia");
            }

        }

        public void popAll(){
            Node no;
            do{

                this.pop();

            }while(this.head != null);{

                System.out.println("A cabeça esta nula !");

            }
        }

        public int getSize(){
            return this.size;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Cabeça ->[ ").append(head).append(" ]<- Cauda \n");
            //return "Node [elemento=" + elemento + ", next=" + next + "]";
            return builder.toString();
        }
}