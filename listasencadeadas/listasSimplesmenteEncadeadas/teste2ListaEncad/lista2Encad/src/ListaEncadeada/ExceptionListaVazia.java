package ListaEncadeada;

public class ExceptionListaVazia extends Exception {
    
    private String head; 

    

    public ExceptionListaVazia(String message, String head) {
        super(message);
        this.head = head;
    }


    @Override
    public String toString() {
        return "Lista Vazia [ head = " + head + "], não é posível excluir";
    }

    
   
}
