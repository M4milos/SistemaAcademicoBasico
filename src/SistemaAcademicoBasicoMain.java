import java.util.ArrayList;
import java.util.List;

public class SistemaAcademicoBasicoMain {

    public static void main(String[] args) {
        Curso curso = new Curso("Ciências da Computação");
        Fase fase = new Fase("2");
        Disciplina poo = new Disciplina("Programação Orientada a Objetos");
        fase.AdicionarDisciplina(poo);
        curso.AdicionarFase(fase);

        Professor prof1 = new Professor("Rodrigo Curvello");
        poo.AdicionarProfessor(prof1);

        Aluno aluno = new Aluno("João", curso);
        aluno.matricular(poo);

        Matricula matricula = aluno.getMatricula().get(0);
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

        System.out.println("Situação do aluno em " + poo.getDescricao() + ": " + matricula.getSituacao());
    }

}
