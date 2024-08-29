package org.example;

public abstract class Projeto {

    private String nome;
    private float progressoAtual;
    private float progressoFinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getProgressoAtual() {
        return progressoAtual;
    }

    public void setProgressoAtual(float progressoAtual) {
        this.progressoAtual = progressoAtual;
    }

    public float getProgressoFinal() {
        return progressoFinal;
    }

    public void setProgressoFinal(float progressoFinal) {
        this.progressoFinal = progressoFinal;
    }

    public float calcularPercentualConcluido() {
        return (this.progressoAtual / this.progressoFinal) * 100;
    }

    public abstract String verificarStatus();

    public String getTipo() {
        return "Projeto";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", progresso=" + this.verificarStatus() +
                '}';
    }
}
