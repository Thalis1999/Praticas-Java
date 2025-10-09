package Hackathon;

import java.util.Scanner;

public class Tarefa_4_formatting {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        for (int i = 0; i < 3; i++) {

            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, x); // Código de formatação
            }
        System.out.println("==================================");

    }

}
