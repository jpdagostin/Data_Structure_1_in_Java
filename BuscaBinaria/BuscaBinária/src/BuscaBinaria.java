public class BuscaBinaria {

    public static int serchBinary(int num, int vetor[]){
        int p = 0;              // Declaração e inicialização da variável "p" que representa o índice inicial do vetor.
        int n = vetor.length;   // Declaração e inicialização da variável "n" que armazena o tamanho do vetor.
        int u = n-1;            // Declaração e inicialização da variável "u" que representa o índice final do vetor.
        int m = 0;              // Declaração e inicialização da variável "m" que representa o índice do meio do vetor.

        while(p <= u){          // Loop while que executa enquanto o índice inicial não ultrapassar o índice final.
            m = (p + u) / 2;    // Cálculo do índice do meio do vetor.
            if(num == vetor[m]){    // Verifica se o número procurado é igual ao valor no índice médio do vetor.
                return 1;       // Retorna 1 se o número for encontrado no vetor.
            } else {
                if(num < vetor[m]){    // Verifica se o número procurado é menor que o valor no índice médio do vetor.
                    u = m - 1;  // Atualiza o índice final para o índice médio menos 1.
                } else {
                    u = m + 1;  // Atualiza o índice inicial para o índice médio mais 1.
                }
            }
        }
        return 0;   // Retorna 0 se o número não for encontrado no vetor.
    }

    public static void main(String[] args) throws Exception {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};  // Declaração e inicialização do vetor ordenado.
        int num = 7;  // Número a ser buscado no vetor.
        int result = 0;  // Variável para armazenar o resultado da busca binária.
        System.out.println("Busca Binária!");
        System.out.println("Buscando o número ->" + num);
        result = serchBinary(num, vetor);  // Chamada do método de busca binária.
        System.out.println("Resultado da busca binária =" + result);
    }
}
