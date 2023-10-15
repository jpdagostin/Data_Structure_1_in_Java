package ListaEncadeada;

public class ListaEncadeadaTeste {

    //ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
    
    public static void main(String[] args){
        ListaEncadeadaTeste listaEncadeadaTeste = new ListaEncadeadaTeste();
        listaEncadeadaTeste.execute();
        
       
    }

    public void adicionar(ListaEncadeada listaEncadeada){
        listaEncadeada.push("João");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Maria");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Antonio");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Unibrasil");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Marcos");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Eugenio");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Leão");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("Joaquim");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("José");
        //System.out.println(listaEncadeada);

        listaEncadeada.push("João Pedro Dagostin");
        System.out.println(listaEncadeada);

        System.out.println("tamanho = " + listaEncadeada.getSize()); 
    }

    public void removerElemento(ListaEncadeada listaEncadeada){
        System.out.println(" Um item da lista será removido ");
        listaEncadeada.pop();
        System.out.println("Node ->" + listaEncadeada);
    }

    public void removerTodosOsElementos(ListaEncadeada listaEncadeada){
        System.out.println(" Todos os iteins da lista serão removidos ");
        listaEncadeada.popAll();
        System.out.println("Node ->" + listaEncadeada);
    }


    public void execute(){
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        try{

            adicionar(listaEncadeada);
            //removerElemento(listaEncadeada);
            //removerTodosOsElementos(listaEncadeada);

        }catch(Exception e){
            System.out.println("Ocorreu um erro !");
        }

    }
    
}
