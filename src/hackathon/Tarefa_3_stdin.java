package hackathon;

import java.util.Scanner;

public class Tarefa_3_stdin {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();   //Lê o "vazio" e executa abaixo
        String s = scanner.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }
}
