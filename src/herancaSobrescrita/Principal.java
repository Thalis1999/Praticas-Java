package herancaSobrescrita;

public class Principal {
    static void main() {

        // Herança por implementacação/pobre.
        Visitante visitante = new Visitante();
        visitante.setNome("Thalis");
        visitante.setIdade(21);
        visitante.setSexo("M");

        Aluno aluno = new Aluno();
        aluno.setNome("Joao");
        aluno.setCurso("Informatica");
        aluno.setIdade(31);
        aluno.setSexo("M");
        aluno.pagarMensalidade();

        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Maria  ");
        bolsista.setBolsa(100);
        bolsista.pagarMensalidade();
    }
}
