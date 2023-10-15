public class ExceptionPilhaVazia extends Exception {
    
    private int topo; 

    public ExceptionPilhaVazia(int topo) {
        //super(message);
        this.topo = topo;
    }

    @Override
    public String toString() {
        return "A LISTA ESTÁ VAZIA! ESTA OPERAÇÃO NÃO PODE SER EXECUTADA! [ TOPO DA LISTA = " + topo + " ]\n";
    }

}