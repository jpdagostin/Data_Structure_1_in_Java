import java.util.Arrays;

public class Pilha {

    String elementos[];
    int topo;

    public Pilha(){
        elementos = new String[10];
        topo = -1;//definindo o topo numa posição inválida
    }

    public int sizePilha() {
        return (topo + 1);
        }
        

    public void push(String elemento)throws ExceptionPilhaCheia {
        if(isFull()){

            throw new ExceptionPilhaCheia(topo);

        }else{
       
            topo++;//incrementa o topo da lista que é iniciado com -1
            elementos[topo] = elemento;//faz com que o elemento inserido se torno este novo topo

        }
    }

    public String pop()throws ExceptionPilhaVazia{
        if(isEmpty()){
        
            throw new ExceptionPilhaVazia(topo);

        }else{
            String elemento;
            elemento = elementos[topo];//pega o elemento topo
            topo--;//desencrementa o topo fazendo que o topo se torne o anterior 
            return elemento;//retornando o elemento
        }

    }

    public boolean isEmpty(){
        return(topo == -1); 

    }

    public boolean isFull(){
        return(topo == 10);
    }
    
    public String top()throws ExceptionPilhaVazia{
        if(isEmpty()){

            throw new ExceptionPilhaVazia(topo);

        }else{

            return elementos[topo]; //retorna o elemento que esta no topo

        }

        
       
    }

    @Override
    public String toString() {
        return "\nPilha[ ->" + Arrays.toString(elementos) + ", topo=" + topo + "]";
    }
    
}
