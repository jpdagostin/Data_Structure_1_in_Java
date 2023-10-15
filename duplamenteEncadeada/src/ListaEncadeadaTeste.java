public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        ListaEncadeadaTeste listaEncadeadaTeste = new ListaEncadeadaTeste();
        listaEncadeadaTeste.execute();
    }
    
    public void adicionarHead(ListaEncadeada listaEncadeada){

        System.out.println("\nTodos os itens serão inseridos! \n");

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

        System.out.println(listaEncadeada);

        System.out.println("Tamanho -> " + listaEncadeada.getSize());

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

        System.out.println(listaEncadeada);

        System.out.println("Tamanho -> " + listaEncadeada.getSize());

    }

    public void removerUmElemento(ListaEncadeada listaEncadeada){

        System.out.println("\n\nUm item da lista será removido!");
        listaEncadeada.popHead();
        System.out.println("\nTamanho -> " + listaEncadeada.getSize());
        System.out.println(listaEncadeada);
        
    }

    public void removerTodosOsElementos(ListaEncadeada listaEncadeada){

        System.out.println("\n\nTodos os itens da lista serão removidos!\n");
        listaEncadeada.popAll();
        System.out.println("\nTamanho -> " + listaEncadeada.getSize());
        System.out.println(listaEncadeada);
        
    }

    public void execute(){
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        try {

            adicionarHead(listaEncadeada);
            //adicionarCauda(listaEncadeada);
            //removerTodosOsElementos(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            removerUmElemento(listaEncadeada);
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro! Método Execute");
        }
    }
}
