
    public class No<E> {

        private E elemento;
        private No<E> next;

            public No(E elemento){
                this.elemento = elemento;
                this.next = null;
            }
            public No(E elemento, No<E> next){
                this.elemento = elemento;
                this.next = next;
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


            
        @Override
        public java.lang.String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[elemento = ").append(elemento).append(", proximo = ").append(next).append("]");
            //return "No [elemento=" + elemento + ", next=" + next + "]";
            return stringBuilder.toString();
            
        }

        
    
    }
