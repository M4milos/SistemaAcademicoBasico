import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private List<Frequencia> frequencias = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private Situacao situacao;

    public Matricula(Aluno aluno) {
        setAluno(aluno);
    }

    public Matricula(Aluno aluno, Disciplina disciplina) {
        setAluno(aluno);
        setDisciplina(disciplina);
    }

    public Matricula(Aluno aluno, List<Avaliacao> avaliacoes, Disciplina disciplina, List<Frequencia> frequencias, Situacao situacao) {
        setAluno(aluno);
        setAvaliacoes(avaliacoes);
        setDisciplina(disciplina);
        setFrequencias(frequencias);
        setSituacao(situacao);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(List<Frequencia> frequencias) {
        this.frequencias = frequencias;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void calcularSituacao() {
        long presencas = frequencias.stream().filter(Frequencia::isPresente).count();
        double freqPercent = (frequencias.size() == 0) ? 0 : (presencas * 100.0 / frequencias.size());
        double media = avaliacoes.stream().mapToDouble(Avaliacao::getNota).average().orElse(0);

        if (freqPercent < 75)
            situacao = Situacao.REPROVADO_POR_FALTA;
        else if (media >= 6)
            situacao = Situacao.APROVADO;
        else
            situacao = Situacao.REPROVADO;
    }

    public void registrarFrequencia(Professor professor, boolean presente) {
        frequencias.add(new Frequencia(professor, presente));
    }

    public void registrarAvaliacao(Professor professor, double nota) {
        avaliacoes.add(new Avaliacao(professor, nota));
    }

}
