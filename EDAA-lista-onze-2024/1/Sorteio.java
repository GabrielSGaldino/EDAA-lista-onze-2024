import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Sorteio {

    public static void main(String[] args) {
        // Criando a lista de números com repetições
        List<Integer> numerosComRepeticao = new ArrayList<>();
        numerosComRepeticao.add(1);
        numerosComRepeticao.add(10);
        numerosComRepeticao.add(50);
        numerosComRepeticao.add(60);
        numerosComRepeticao.add(10);
        numerosComRepeticao.add(200);
        numerosComRepeticao.add(300);
        numerosComRepeticao.add(500);
        numerosComRepeticao.add(60);
        numerosComRepeticao.add(700);
        numerosComRepeticao.add(800);
        numerosComRepeticao.add(900);
        numerosComRepeticao.add(14);
        numerosComRepeticao.add(33);
        numerosComRepeticao.add(55);
        numerosComRepeticao.add(70);
        numerosComRepeticao.add(80);
        numerosComRepeticao.add(3);
        numerosComRepeticao.add(100);
        numerosComRepeticao.add(200);
        numerosComRepeticao.add(25);
        numerosComRepeticao.add(50);
        numerosComRepeticao.add(75);
        numerosComRepeticao.add(100);
        numerosComRepeticao.add(300);
        numerosComRepeticao.add(1000);
        numerosComRepeticao.add(11);
        numerosComRepeticao.add(22);
        numerosComRepeticao.add(35);
        numerosComRepeticao.add(33);
        numerosComRepeticao.add(60);
        numerosComRepeticao.add(70);
        numerosComRepeticao.add(80);
        numerosComRepeticao.add(100);
        numerosComRepeticao.add(10);
        numerosComRepeticao.add(150);
        numerosComRepeticao.add(75);
        numerosComRepeticao.add(85);
        numerosComRepeticao.add(95);
        numerosComRepeticao.add(200);

        // Criando um conjunto HashSet para armazenar os números sem repetição
        HashSet<Integer> numerosSemRepeticao = new HashSet<>(numerosComRepeticao);

        // Criando uma nova lista para armazenar os números sem repetição
        List<Integer> numerosSorteio = new ArrayList<>(numerosSemRepeticao);

        // Mostrando a quantidade de números a serem sorteados
        System.out.println("Quantidade de números a serem sorteados: " + numerosSorteio.size());

        // Mostrando os números a serem sorteados
        System.out.println("Números a serem sorteados: " + numerosSorteio);
    }
}
