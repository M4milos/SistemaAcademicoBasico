import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String descricao;
    private List<Professor> professores = new ArrayList<>();

    public Disciplina(String descricao) {
        setDescricao(descricao);
    }

    public Disciplina(String descricao, List<Professor> professores) {
        setDescricao(descricao);
        setProfessores(professores);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(!descricao.isEmpty())
            this.descricao = descricao;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        if (professores != null)
            this.professores = professores;
    }

    public void AdicionarProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina [descricao=").append(descricao).append("]");
        return sb.toString();
    }
}
