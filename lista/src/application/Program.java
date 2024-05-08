package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Breno");
        list.add("Bruno");
        list.add("Bruna");
        list.add("Marcos");
        list.add(2, "Pedro");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------");
        System.out.println("Index of Breno: " + list.indexOf("Breno"));
        System.out.println("------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

    }

}
