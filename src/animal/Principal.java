package animal;

import herancaSobrescrita.Pessoa;

public class Principal {
    static void main() {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();

        // mesmos métodos com comportamentos diferentes
        m.setPeso(250);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.setPeso(25);
        p.setIdade(4);
        p.setMembros(2);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        c.setPeso(100);
        c.setIdade(4);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();



    }
}
