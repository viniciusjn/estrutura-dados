// Utilize o vetor de tamanho dinâmico criado anteriormente. Gere 1000 números aleatórios e armazene neste vetor.

package main;
import java.util.ArrayList;
import java.util.Random;

public class ex05 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.add(random.nextInt());
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println(vetor.get(i));
        }
    }
}
