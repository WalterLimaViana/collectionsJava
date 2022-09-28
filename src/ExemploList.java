import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione sete notas");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4,8d);
        System.out.println(notas);


    }
}
