package ultraemojicombat;

public class Principal {
    static void main() {
        ultraemojicombat.Lutador l1[] = new Lutador[4];

        l1[0] = new Lutador("Prestes", "França",
                31, 1.75f, 68.9f,
                11, 3, 1);

        l1[1] = new Lutador("Henk", "Brasil",
                31, 1.75f, 68.9f,
                11, 3, 1);

        l1[2] = new Lutador("Prela", "Mongolia",
                32, 1.75f, 68.9f,
                11, 3, 1);

        l1[3] = new Lutador("Talis", "Sudão",
                22, 1.77f, 68.8f,
                11, 3, 1);

        l1[4] = new Lutador("Ane", "Itália",
                21, 1.76f, 68.6f,
                11, 3, 1);
        l1[0].status();
    }
}
