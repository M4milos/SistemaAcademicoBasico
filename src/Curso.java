import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String descricao;
    private List<Fase> fases = new ArrayList<>();
    private List<OfertaDisciplina> ofertas = new ArrayList<>();

    public Curso(String descricao) {
        setDescricao(descricao);
    }
    public Curso(String descricao, List<Fase> fases) {
        setDescricao(descricao);
        setFases(fases);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(!descricao.isEmpty())
            this.descricao = descricao;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        if(fases != null)
            this.fases = fases;
    }

    public List<OfertaDisciplina> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<OfertaDisciplina> ofertas) {
        if(ofertas != null)
            this.ofertas = ofertas;
    }

    public void AdicionarFase(Fase fase){
        this.fases.add(fase);
    }

    public void ofertarDisciplina(Disciplina disciplina, String periodo) {
        OfertaDisciplina oferta = new OfertaDisciplina(disciplina, periodo);
        ofertas.add(oferta);
    }
}
