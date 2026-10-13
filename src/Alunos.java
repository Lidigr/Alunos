public class Alunos{

    private String nome;
    private double[] notas;

    public Alunos(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double[] getNotas() {
        return notas;
    }
}


