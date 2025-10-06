import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Curso curso;
    private List<Matricula> matriculas = new ArrayList<>();

    public Aluno(String nome) {
        setNome(nome);
    }

    public Aluno(String nome, Curso curso) {
        setNome(nome);
        setCurso(curso);
    }

    public Aluno(String nome, Curso curso, List<Matricula> matriculas) {
        setNome(nome);
        setCurso(curso);
        setMatricula(matriculas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty())
            this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if(curso != null)
            this.curso = curso;
    }

    public List<Matricula> getMatricula() {
        return matriculas;
    }

    public void setMatricula(List<Matricula> matriculas) {
        if(matriculas != null || matriculas.size() > 0)
            this.matriculas = matriculas;
    }

    public void matricular(Disciplina d) {
        Matricula m = new Matricula(this, d);
        matriculas.add(m);
    }




}
