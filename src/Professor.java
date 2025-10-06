public class Professor {
    private String nome;

    public Professor(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty())
            this.nome = nome;
    }
}
