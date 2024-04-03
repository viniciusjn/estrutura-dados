// Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcula a soma dos elementos.

package main;

public class ex06 {

    public static int calculaSoma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = calculaSoma(vetor);
        System.out.println("Soma dos elementos do vetor: " + soma);
    }
}
