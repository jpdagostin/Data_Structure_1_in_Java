import java.util.LinkedList;
import java.util.Queue;


public class PilhaTeste {
    
    public static void main(String[] args) throws ExceptionPilhaVazia, ExceptionPilhaCheia{
            PilhaTeste pilhateste = new PilhaTeste();
            pilhateste.execute();
            
      
    }

    public void adicionarUmElemento(Pilha pilha) throws ExceptionPilhaCheia, ExceptionPilhaVazia{

        pilha.push("João");
        System.out.println("\nEmpilhei todos os elementos pré-peparados:\n\n" + "[" + pilha +"]");
    }

    public void adicionar(Pilha pilha) throws ExceptionPilhaCheia, ExceptionPilhaVazia{

        int size = pilha.sizePilha();

        pilha.push("João");
            //System.out.println(element);
        pilha.push("Maria");
            //System.out.println(pilha);
        pilha.push("Antonio");
            //System.out.println(pilha);
        pilha.push("Unibrasil");
            //System.out.println(pilha);
        pilha.push("Marcos");
            //System.out.println(pilha);
        pilha.push("Eugenio");
            //System.out.println(pilha);
        pilha.push("Leão");
            //System.out.println(pilha);
        pilha.push("Joaquim");
            //System.out.println(pilha);
        pilha.push("José");
            //System.out.println(pilha);
        pilha.push("João Pedro Dagostin");


        System.out.println("\nEmpilhei todos os elementos pré-peparados:\n\n" + "[" + pilha +"]");

    }

    public void removeAllElements(Pilha pilha) throws ExceptionPilhaVazia{
        System.out.println("\nOPERAÇÃO REMOVER TODOS OS ELEMENTOS: \nTodos os itens da pilha serão removidos !\n");
            
        while(!pilha.isEmpty()){

            String element = pilha.pop();
            int size = pilha.sizePilha();
            System.out.println("Desempilhei -> " + "[ " + size + " ] " + element);
            System.out.println("    Tamanho da pilha é -> " + "[ " + pilha.topo + " ]" + "\n");

        }

    }

    public void remover(Pilha pilha) throws ExceptionPilhaVazia{
        System.out.println("OPERAÇÃO REMOVER UM ITEM DA PILHA: \nSerá removido um item da pilha ! \n ");
        pilha.pop();
        //System.out.println("Node ->" + pilha);
    }

    public void execute() throws ExceptionPilhaCheia, ExceptionPilhaVazia{
        Pilha pilha = new Pilha();

        adicionar(pilha);

        //adicionarUmElemento(pilha);

        removeAllElements(pilha);

        remover(pilha);

        adicionarUmElemento(pilha);

        
    }
}
