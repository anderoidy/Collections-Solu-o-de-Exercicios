import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class perguntasDoCrime {
    public static void main(String[] args) {

        int contadorDeSim = 0;
        int contadorDeNao = 0;

        Scanner pegaDoUsuario = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();

        System.out.println("Responda as Seguintes Perguntas");

        System.out.println("Telefonou para a vítima? ");
        String recebeSeTelefonou = pegaDoUsuario.next();
        perguntas.add(recebeSeTelefonou);
        if (recebeSeTelefonou.equals("sim")) contadorDeSim = 1;
        if (recebeSeTelefonou.equals("nao")) contadorDeNao = 1;

        System.out.println("Esteve no local do crime?");
        String recebeSeEsteveNoLocal = pegaDoUsuario.next();
        perguntas.add(recebeSeEsteveNoLocal);
        if (recebeSeEsteveNoLocal.equals("sim")) contadorDeSim += 1;
        if (recebeSeEsteveNoLocal.equals("nao")) contadorDeNao += 1;

        System.out.println("Mora perto da vitima?");
        String recebeSeMoraPerto = pegaDoUsuario.next();
        perguntas.add(recebeSeMoraPerto);
        if (recebeSeMoraPerto.equals("sim")) contadorDeSim +=1;
        if (recebeSeMoraPerto.equals("nao")) contadorDeNao += 1;

        System.out.println("Devia para a Vítima?");
        String recebeSeDevia = pegaDoUsuario.next();
        perguntas.add(recebeSeDevia);
        if (recebeSeDevia.equals("sim")) contadorDeSim += 1;
        if (recebeSeDevia.equals("nao")) contadorDeNao += 1;

        System.out.println("Ja trabalhou com a vítima?");
        String recebeSeTrabalhou = pegaDoUsuario.next();
        perguntas.add(recebeSeTrabalhou);
        if (recebeSeTrabalhou.equals("sim")) contadorDeSim += 1;
        if (recebeSeTrabalhou.equals("nao")) contadorDeNao += 1;

        System.out.println(perguntas);
        System.out.println("Contador de sim = " +contadorDeSim);
        System.out.println("Contador de nao = " +contadorDeNao);

        if (contadorDeSim == 2) System.out.println("Essa é classificada como um Supeito");
        if (contadorDeSim == 3 || contadorDeSim == 4) System.out.println("Essa pessoa é classificada como Cúmplice");
        if (contadorDeSim == 5) System.out.println("Essa pessoa é classificada como Assasinasim ");
        else System.out.println("Essa pessoas é cclassificada como inocente");

    }
}
