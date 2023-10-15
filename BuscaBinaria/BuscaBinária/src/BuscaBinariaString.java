public class BuscaBinariaString {

    public static int searchBinary(String name, String[] array){
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            int comparison = name.compareTo(array[middle]);

            if(comparison == 0){
                return middle;
            }else if(comparison < 0){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return -1; //elemento não encontrado
    }

    public static void main(String[] args) throws Exception {
        String[] array = {"Alice", "fdg", "jhjh", "David", "Eve", "hfdgd", "aaaa", "Henry", "Indio", "Joao"}; // Vetor de strings ordenado
        String name = "hfdgd";  // String a ser buscada no vetor
        int result = searchBinary(name, array);  // Chamada do método de busca binária

        if (result != -1) {
            System.out.println("O elemento " + name + " foi encontrado no índice " + result + ".");
        } else {
            System.out.println("O elemento " + name + " não foi encontrado no vetor.");
        }
    }
}
