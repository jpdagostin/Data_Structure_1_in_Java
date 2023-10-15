public class ListaEncadeada<E>{

    private No<E> head;//criando o atributo cabeça do tipo classe NO
    private No<E> cauda;//criando o atributo cauda do tipo classe NO
    private int size = 0;//criando o atributo size

        public void pushHead(E elemento){//método para inserir pela cabeça

            No<E> no = new No<E>();//instanciando um novo NO

            no.setElemento(elemento);//setando o elemento 
            no.setNext(head);//apontando a nova cabeça
            head = no;//cabeça = ao novo objeto instanciado, assim como cada objeto novo será
            size++;//incremente o tamanho

        }

        public void pushCauda(E elemento){

            No<E> no = new No<E>();// instanciando um novo NO

            if(size == 0){//se o tamanho da lista for 0
                this.head = no;//a cabeça é igual ao novo NO criado
            }else{//se não

                this.cauda.setNext(no);//aponte pra cauda

            }
            this.cauda = no;//cauda = ao novo objeto instaciado
            size++;//incremente o tamanho

        }

        public void popHead(){//metodo remover pela cabeça

            if(head != null){//se a cabeça for nula

                No no = this.head;//Faça com que o nó seja igual a cabeça
                this.head = this.head.getNext();//faça com que a cabeça seja igual ao proximo elemento
                no = null;//faça com que esse no anterior, que era a cabeça, seja igual a nulo
                this.size--;//desincremente

            }else{

                System.out.println("Lista Vazia !");

            }

        }

        public void popCauda(){

            No no = this.head;

            if(head != null){
                
                if(head.getNext() == null){
                    head = null;
                }else{
                    No penultimoNO = head;
                    while(penultimoNO.getNext().getNext() != null){
                        penultimoNO = penultimoNO.getNext();
                    }
                    penultimoNO = null;
                }
            }
          
    }


        public void popAll(){
            do{

                this.popHead();//faça o método popHead

            }while(this.head != null);{//enquanto a cabeça for diferente de null

                System.out.println("A cabeça está nula!");

            }
        }

        public int getSize(){

            return this.size;

        }

        public boolean isEmpty(){

            return(size == 0);

        }

        //public boolean isFull(){

        //}
        
        @Override
        public java.lang.String toString() {

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");

            No firtElelement = head;
            while(firtElelement != null){
                stringBuffer.append(firtElelement.getElemento() + " ");
                firtElelement = firtElelement.getNext();
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
            //return "ListaEncadeada [head=" + head + ", cauda=" + cauda + ", size=" + size + "]";
        }
        
}