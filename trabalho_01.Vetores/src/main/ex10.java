// Crie um vetor com os elementos {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189}. Imprima os elementos do vetor na ordem inversa.

package main;

public class ex10 {

    public static void main(String[] args) {
        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
