package Hackathon;

import java.util.Scanner;

public class Tarefa_6_loops2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Lê o numero de consultas
        int q = scanner.nextInt();

        //Lê a quantidade de consultas que inserir
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int termoAtual = a;

            // Loop interno: gera os 'n' termos da série
            for (int j = 0; j < n; j++) {
                // Calcula (2^j * b) e soma ao termo atual
                // Math.pow retorna um double, então convertemos para int
                termoAtual += (int)(Math.pow(2, j) * b);

                // Imprime o termo atual seguido de um espaço
                System.out.print(termoAtual + " ");
            }
            // Após o loop interno terminar, pula uma linha para a próxima consulta
            System.out.println();
        }
        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
