public class Frequencia {
    private Professor professor;
    private boolean presente;

    public Frequencia(Professor professor, boolean presente ) {
        setProfessor(professor);
        setPresente(presente);
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
