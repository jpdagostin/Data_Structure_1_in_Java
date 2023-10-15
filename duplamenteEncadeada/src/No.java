
    public class No<E> {

        private E elemento;
        private No<E> next;
        private No<E> prev;

            public No(E elemento){
                this.elemento = elemento;
                this.next = null;
                this.prev = null;
            }
            public No(E elemento, No<E> next, No<E> prev){
                this.elemento = elemento;
                this.next = next;
                this.prev = prev;
            }



            public E getElemento() {
                return elemento;
            }
            public void setElemento(E elemento) {
                this.elemento = elemento;
            }



            public No<E> getNext() {
                return next;
            }
            public void setNext(No<E> next) {
                this.next = next;
            }


            public No<E> getPrev(){
                return prev;
            }
            public void setPrev(No<E> prev){
                this.prev = prev;
            }


            
        @Override
        public java.lang.String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[elemento = ").append(elemento).append(", proximo = ").append(next).append("]");
            //return "No [elemento=" + elemento + ", next=" + next + "]";
            return stringBuilder.toString();
            
        }

        
    
    }
