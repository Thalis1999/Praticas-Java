package banco;

public class Principal {
    static void main() {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubi");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("aaa");
        p2.abrirConta("CP");

        p1.sacar(150);
        p2.sacar(500);

        p1.estadoAtual();


    }
}
