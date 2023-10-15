public class ListaEncadeada<T>{

    private Node<T> head;
    private Node<T> cauda;
    private int size = 0;

        public void push(T elemento){
            
            Node<T> no = new Node<T>(elemento);//instanciando um novo elemento

                if(size == 0){//se o tamanho da lista for 0

                    this.head = no;//o novo elemento inserido é a cabeça 
                    
                }else{//se não

                    this.cauda.setNext(no);//o proximo no será a cauda
                    
                }

            this.cauda = no;//cauda igual ao nó
            size++;//incremente o tamanho

        }

        public void pop(){

            if(isEmpty()){

                System.out.println("Lista Vazia!");

            }else{

                Node no = this.head;//faço com que o No seja a Cabeça
                this.head = this.head.getNext();//faço com que a cabeça seja o próximo NO
                no = null;//faço o Nó ser Nulo
                size--;//desincremento

            }

        }

        public void popAll(){

            do{

                this.pop();

            }while(this.head != null);{

                System.out.println("A lista esta vazia!");
                
            }

        }

        public boolean isEmpty(){
            return(size == 0);
        }
}