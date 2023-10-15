import java.util.Locale;
import java.util.Scanner;

public class Interface {
    
    public static void main(String[] args){

        Lista<Integer> lista = new Lista<>();

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao;

        do{
            showMenu();
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:{
                    System.out.println("Digite um número !");
                    int value = scanner.nextInt();
                    lista.addHead(value);
                    break;
                }
                case 2:{
                    System.out.println("Digite um número !");
                    int value = scanner.nextInt();
                    lista.addCauda(value);
                    break;
                }
                case 3:{
                    System.out.println(lista);
                }
                case 4:{
                    System.out.println("Fim do Programa!");
                }
                default:{
                    System.out.println("Opção inválida!");
                }
            }
        }while(opcao != 4);{
            scanner.close();
        }
    }

    public static void showMenu(){

        System.out.println("1 - Inserir novo elemento na lista pela Cabeça");

        System.out.println("2 - Inserir novo elemento na lista pela Cauda");
        
        System.out.println("3 - Mostrar lista");
        
        System.out.println("4 - Sair");

    }
}
