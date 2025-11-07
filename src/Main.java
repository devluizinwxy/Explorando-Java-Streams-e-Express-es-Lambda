
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>((Arrays.asList(1, 2, 3, 45, 4, 6, 5, 4)));
        numeros.stream().filter(n -> n % 3 == 0).forEach(System.out::println);
        System.out.println();
        List<String> nomes = new ArrayList<>(Arrays.asList("bruno", "lucas", "silva"));
        nomes.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
        System.out.println();
        int soma = numeros.stream().reduce(0, (a, b) -> a + b * 4 * 120);
        System.out.println(soma);
        int mult = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mult);
        System.out.println();
        numeros.forEach(System.out::println);
        System.out.println();
        numeros.sort((x, y) -> x.compareTo(y));
        numeros.forEach(System.out::println);
        System.out.println();
        nomes.forEach(System.out::println);
        System.out.println();
        nomes.sort((a, b) -> a.compareTo(b));
        nomes.forEach(System.out::println);
        System.out.println();
        long quantidadeNumeros = numeros.stream()
                .filter(a -> a > 20)
                .count();
        System.out.println(quantidadeNumeros);
        System.out.println();
        List<Integer> number = numeros.stream().filter(n -> n > 5)
                .map(n -> n * 3)
                .collect(Collectors.toList());
        System.out.println();
        number.forEach(System.out::println);
        sc.close();
    }
}