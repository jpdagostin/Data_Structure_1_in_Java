public class Atividade4 {
    public static void main(String[] args) throws Exception {
            teste();
        }

        public static void teste(){
            
                // Vetor de strings desordenado
                String[] vetor ={"Matheus", "Zebu", "Caique", "Zoio", "Alek", "Joao", "Gui", "Bruno", "Hian", "Abimael"};
                // Impressão do vetor desordenado
                System.out.println("Vetor desordenado:");
                for (String element : vetor) {
                System.out.print(element + " / ");
                }
                System.out.println("\n");
               
                // Chamada do método para ordenar o vetor
                performOrdination(vetor);
                // Impressão do vetor ordenado
                System.out.println("Vetor ordenado:");
                for (String element : vetor) {
                System.out.print(element + " / ");
                }
                System.out.println("\n");

            String name = "Robson";  // String a ser buscada no vetor
            int result = searchBinary(name, vetor);  // Chamada do método de busca binária
        
            if (result != -1) {
                System.out.println("O elemento " + name + " foi encontrado no índice " + result + ".");
            } else {
                System.out.println("O elemento " + name + " não foi encontrado no vetor.");
            }
    }
        
        // Método para ordenar o vetor de strings
        private static void performOrdination(String[] vetor) {
            int v = vetor.length;
            String temp;
        
            // Loop externo para percorrer o vetor
            for(int externo = 0; externo < v - 1; externo++) {
                // Loop interno para comparar elementos adjacentes e fazer as trocas necessárias
                for(int interno = 0; interno < v - 1; interno++) {
                    // Verifica se o elemento atual é maior que o próximo elemento
                    if(vetor[interno].compareTo(vetor[interno + 1]) > 0) {
                        // Realiza a troca dos elementos
                        temp = vetor[interno + 1];
                        vetor[interno + 1] = vetor[interno];
                        vetor[interno] = temp;
                    }
                }
            }
        }
        
        // Método para realizar busca binária em um vetor ordenado
        public static int searchBinary(String name, String[] array){
            int left = 0;
            int right = array.length - 1;
        
            while(left <= right){
                int middle = (left + right) / 2;
        
                int comparison = name.compareTo(array[middle]);
        
                if(comparison == 0){
                    return middle;  // Retorna o índice se o elemento for encontrado
                } else if(comparison < 0){
                    right = middle - 1;  // Ajusta a posição do limite direito
                } else {
                    left = middle + 1;  // Ajusta a posição do limite esquerdo
                }
            }
            return -1; // Elemento não encontrado
        }
}    