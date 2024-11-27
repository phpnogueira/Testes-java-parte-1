import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
            System.out.println("Digite o número de pessoas:");
            int numeroDePessoas = scanner.nextInt();
            scanner.nextLine();

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite o sexo da pessoa " + (i + 1) + ":");
            String sexo = scanner.nextLine();
            pessoas.add(new Pessoa(nome, sexo));
        }
        System.out.println("Lista original de pessoas:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));


        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());


        System.out.println("\nLista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}