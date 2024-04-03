// Crie um vetor com os elementos {1, 2, 3, 4, 5, 6, 7, 8, 9}. Crie um método que calcule a média dos elementos.

package main;

public class ex07 {

    public static int calculaMedia(int[] vetor) {

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma/vetor.length;
    }

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = calculaMedia(vetor);
        System.out.println("Média dos elementos do vetor: " + soma);
    }
}
