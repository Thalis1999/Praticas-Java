package Hackathon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tarefa_5_if {
    static void main() throws
            IOException {
        //Lê bytes em blocos do teclado.
        BufferedReader bufferedReader = new BufferedReader
                (new InputStreamReader(System.in));

        //Tira os espaços do valor string pego antes do enter. Depois transforma em int.
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        for (int i = 1; i <= 10; i++) {
            int resultado = N * i;
            System.out.println(N + " x " + i + " = " + resultado);
        }
    }
}

