package exceptionPilha.stack;
public class ExceptionPilhaCheia extends Exception {
    
        private int topo; 
    
        public ExceptionPilhaCheia(int topo) {
            //super(message);
            this.topo = topo;
        }
    
        @Override
        public String toString() {
            return "A LISTA ESTA CHEIA! ESTA OPERAÇÃO NÃO PODE SER EXECUTADA! [ TOPO DA LISTA = " + topo + " ]\n";
        }
    
    }
