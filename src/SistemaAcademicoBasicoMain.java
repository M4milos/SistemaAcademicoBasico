import java.util.ArrayList;
import java.util.List;

public class SistemaAcademicoBasicoMain {

    public static void main(String[] args) {
        Curso curso = new Curso("Ciências da Computação");
        Fase fase = new Fase("2");
        Fase fase2 = new Fase("2");
        Disciplina poo = new Disciplina("Programação Orientada a Objetos");
        Disciplina poo1 = new Disciplina("Programação Orientada a Objetos 2");
        fase.AdicionarDisciplina(poo);
        fase.AdicionarDisciplina(poo1);
        curso.AdicionarFase(fase);
        curso.AdicionarFase(fase2);

        curso.ofertarDisciplina(poo, "2025/1");
        System.out.println("\nDisciplinas ofertadas:");
        for (OfertaDisciplina o : curso.getOfertas()) {
            System.out.println("- " + o);
        }

        Professor prof1 = new Professor("Rodrigo Curvello");
        poo.AdicionarProfessor(prof1);

        Aluno aluno = new Aluno("João", curso);
        aluno.matricular(poo);
        aluno.matricular(poo1);

        List<Matricula> matriculas = aluno.getMatricula();

        for(Matricula matricula : matriculas){
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarFrequencia(prof1, true);
            matricula.registrarAvaliacao(prof1, 9.0);
            matricula.calcularSituacao();

            System.out.println("Situação do aluno em " + matricula.getDisciplina().getDescricao() + ": " + matricula.getSituacao());

        }


    }

}
