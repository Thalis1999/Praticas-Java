package Hackathon;

import java.util.Scanner;

public class Tarefa_2_if {
    private static final Scanner scanner = new Scanner(System.in);

    static void main() {
        System.out.println("Digite o numero");
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not weird");
            } else if(n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else{
                System.out.println("Not Weird");
            }
        }
    }
}
