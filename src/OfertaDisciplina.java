import java.util.ArrayList;
import java.util.List;

public class OfertaDisciplina {
    private Disciplina disciplina;
    private String periodo; // exemplo: "2025/1"
    private List<Professor> professores;

    public OfertaDisciplina(Disciplina disciplina, String periodo) {
        this.disciplina = disciplina;
        this.periodo = periodo;
        this.professores = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getPeriodo() {
        return periodo;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        if (professores.size() < 4) {
            professores.add(professor);
        } else {
            System.out.println("Já existem 4 professores atribuídos a esta oferta.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina: " + disciplina + "\n");
        sb.append("Periodo: " + periodo + "\n");
        return sb.toString();
    }
}
