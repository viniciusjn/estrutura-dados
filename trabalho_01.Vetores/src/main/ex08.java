// Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}. Crie um método que retorna o maior elemento do vetor.

package main;

public class ex08 {

    public static int valorMaior(int[] vetor) {

        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int maior = valorMaior(vetor);
        System.out.println("Maior elemento do vetor: " + maior);
    }
}
