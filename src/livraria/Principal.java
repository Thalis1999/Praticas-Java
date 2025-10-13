package livraria;

public class Principal {
    static void main() {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "Thalis", 300, p[0]);
        l[1] = new Livro("POO", "Pedro", 500, p[1]);
        l[2] = new Livro("Java", "Guilherme", 300, p[1]);

        System.out.println(l[0].detalhes());
    }
}
