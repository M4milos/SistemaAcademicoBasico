import java.util.ArrayList;
import java.util.List;

public class Fase {
    private String descricao;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Fase(String descricao) {
        setDescricao(descricao);
    }

    public Fase(String descricao, List<Disciplina> disciplinas) {
        setDescricao(descricao);
        setDisciplinas(disciplinas);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(!descricao.isEmpty())
            this.descricao = descricao;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        if(disciplinas != null)
            this.disciplinas = disciplinas;
    }

    public void AdicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
}
