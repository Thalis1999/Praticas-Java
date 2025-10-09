package ultraemojicombat;

public class Principal {
    static void main() {
        ultraemojicombat.Lutador l1[] = new Lutador[4];

        l1[0] = new Lutador("Prestes", "França",
                31, 1.75f, 78.9f,
                7, 5, 5);
        l1[1] = new Lutador("Henk", "Brasil",
                31, 1.75f, 98.9f,
                81, 7, 4);
        l1[2] = new Lutador("Prela", "Mongolia",
                32, 1.75f, 108.9f,
                10, 1, 3);
        l1[3] = new Lutador("Talis", "Sudão",
                22, 1.77f, 128.8f,
                21, 4, 1);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1[0], l1[3]);
        UEC01.lutar();
        l1[0].status();




    }
}
