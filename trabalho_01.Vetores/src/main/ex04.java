// Vetor com tamanho dinâmico. Implemente um vetor que aumente de tamanho dinamicamente à medida que elementos são adicionados a ele. Inicie esse vetor com tamanho 0. Depois, adicione os seguintes itens (um a um): {1, 2, 3, 4, 5}

package main;
import java.util.ArrayList;

public class ex04 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            vetor.add(i);
        }

        for (int elemento : vetor) {
            System.out.println(elemento);
        }
    }
}
