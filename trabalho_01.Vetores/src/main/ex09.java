package main;

public class ex09 {

    public static int valorMenor(int[] vetor) {

        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        int menor = valorMenor(vetor);
        System.out.println("Menor elemento do vetor: " + menor);
    }
}
