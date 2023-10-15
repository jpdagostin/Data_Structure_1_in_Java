import javax.lang.model.element.Element;

public class PilhaTeste {
    
    public static void main(String[] args) throws ExceptionPilhaVazia, ExceptionPilhaCheia{
        PilhaTeste pilhateste = new PilhaTeste();
        pilhateste.execute();
        
    }

    public void adicionar(Pilha pilha) throws ExceptionPilhaCheia{

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

        System.out.println("Empilhei os elementos: " + pilha);

    }

    public void removeAllElements(Pilha pilha) throws ExceptionPilhaVazia{
        System.out.println("\n Todos os itens da pilha serão removidos \n");
            
        while(!pilha.isEmpty()){

            String element = pilha.pop();
            int size = pilha.sizePilha();
            System.out.println("Removi -> " + element);
            System.out.println("Tamanho da pilha -> " + size + "\n");

        }

    }

    public void remover(Pilha pilha) throws ExceptionPilhaVazia{
        System.out.println(" Tentarei remover um item da pilha ! \n ");
        pilha.pop();
        System.out.println("Node ->" + pilha);
    }

    public void execute() throws ExceptionPilhaCheia, ExceptionPilhaVazia{
        Pilha pilha = new Pilha();

        adicionar(pilha);

        removeAllElements(pilha);

        remover(pilha);
    }
}
