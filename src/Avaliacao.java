public class Avaliacao {
    private Professor professor;
    private double nota;

    public Avaliacao(Professor professor, double nota) {
        setProfessor(professor);
        setNota(nota);
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


}
