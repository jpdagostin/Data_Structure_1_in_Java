public class ListaEncadeadaTeste {

    public static void main(String []args){
        ListaEncadeadaTeste listaEncadeadaTeste = new ListaEncadeadaTeste();
        listaEncadeadaTeste.execute();
    }
    
    public void adicionarHead(ListaEncadeada listaEncadeada){

        listaEncadeada.pushHead("Maria");
        listaEncadeada.pushHead("Antonio");
        listaEncadeada.pushHead("UniBrasil");
        listaEncadeada.pushHead("Marcos");
        listaEncadeada.pushHead("João");
        listaEncadeada.pushHead("Karine");
        listaEncadeada.pushHead("Karina");
        listaEncadeada.pushHead("Luís");
        listaEncadeada.pushHead("José");
        listaEncadeada.pushHead("João Pedro Dagostin");

        System.out.println("\nNo --> " + listaEncadeada);

    }

    public void adicionarCauda(ListaEncadeada listaEncadeada){

        listaEncadeada.pushCauda("Maria");
        listaEncadeada.pushCauda("Antonio");
        listaEncadeada.pushCauda("UniBrasil");
        listaEncadeada.pushCauda("Marcos");
        listaEncadeada.pushCauda("João");
        listaEncadeada.pushCauda("Karine");
        listaEncadeada.pushCauda("Karina");
        listaEncadeada.pushCauda("Luís");
        listaEncadeada.pushCauda("José");
        listaEncadeada.pushCauda("João Pedro Dagostin");

        System.out.println("\nNo --> " + listaEncadeada);

    }

    public void removerUmElemento(ListaEncadeada listaEncadeada){

        System.out.println("\nUm item da lista será removido pela cabeça!");
        listaEncadeada.popHead();
        System.out.println("No -> " + listaEncadeada);
        
    }

    public void removerUmElementoCauda(ListaEncadeada listaEncadeada){

        System.out.println("\nUm item da lista será removido pela cauda!");
        listaEncadeada.popCauda();
        System.out.println("No -> " + listaEncadeada);

    }

    public void removerTodosOsElementos(ListaEncadeada listaEncadeada){

        System.out.println("\nTodos os itens da lista serão removidos!");
        listaEncadeada.popAll();
        System.out.println("No -> " + listaEncadeada);
        
    }

    public void execute(){
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        try {

            adicionarHead(listaEncadeada);

            //adicionarCauda(listaEncadeada);
            //removerTodosOsElementos(listaEncadeada);

            removerUmElemento(listaEncadeada);//cabeça
            removerUmElementoCauda(listaEncadeada);//cauda
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro! Método Execute");
        }
    }
}
