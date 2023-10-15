import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

import javax.xml.catalog.Catalog;

public class Fila {

    String elementos[];
    int topo;

    public Fila(){
        elementos = new String[10];
        topo = -1;//definindo o topo numa posição inválida
    }

    public int sizeFila() {
        return (topo + 1);
        }


    public void push(String elemento) {
        // throws ExceptionPilhaCheia
        // try{

            if(isFull()){

                System.out.println("Fila esta cheia!");

                //throw new ExceptionPilhaCheia(topo);

            }else{

                topo++;//incrementa o topo da lista que é iniciado com -1
                elementos[topo] = elemento;//faz com que o elemento inserido se torno este novo topo

            }

        // }catch(ExceptionPilhaCheia exceptionPilhaCheia){

        //     System.out.println(exceptionPilhaCheia);
        //     //return null;

        // }
    }

    // throws ExceptionPilhaVazia
    public String poll() {
        // try{
            if(isEmpty()){

                // throw new ExceptionPilhaVazia(topo);
                System.out.println("Pilha vazia!");
                return null;

            }else{
                String elemento;
                elemento = elementos[topo];//pega o elemento topo
                elementos[topo--] = null;//desencrementa o topo fazendo que o topo se torne o anterior e incrementando null ao desencrementado
                return elemento;//retornando o elemento
            }

        // }catch(ExceptionPilhaVazia exceptionPilhaVazia){

        //     System.out.println(exceptionPilhaVazia);
         //    return null;

        // }

    }

    public boolean isEmpty(){
        return(topo == -1);

    }

    public boolean isFull(){
        return(topo == 10);
    }

    // throws ExceptionPilhaVazia
    public String top(){
        // try{
            if(isEmpty()){

                // throw new ExceptionPilhaVazia(topo);
                System.out.println("Pilha Vazia");
                return null;

            }else{

                return elementos[topo]; //retorna o elemento que esta no topo

            }
        // }
        // catch(ExceptionPilhaVazia exceptionPilhaVazia){

        //     System.out.println(exceptionPilhaVazia);
        //     return null;
        // }

    }

    @Override
    public String toString() {
        return "Fila-->" + Arrays.toString(elementos) + ", Quantidade de elementos = " + sizeFila() + " ]";
    }

}
