public class Main {
    public static void main(String[] args) {
        // Criando um array de 10 posições
        int[] numeros = {1, 4, 2, 7, 5, 3, 8, 6, 9, 10};

        // Utilizando o loop 'for' para percorrer o array e imprimir os valores maiores que 3
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 3) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}