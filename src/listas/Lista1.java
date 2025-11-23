package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Bruno");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------------");
        //list.remove(1);
        list.removeIf(x -> x.startsWith("M"));

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------------");

        System.out.println("Index of bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bruno: " + list.indexOf("Bruno"));

        System.out.println("------------------------------");

        List<String> result = list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------------");
        String name = list.stream().filter(x -> x.startsWith("J")).findFirst().orElse(null);

        System.out.println(name);

    }
}
