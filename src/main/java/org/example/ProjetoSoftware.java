package org.example;

public class ProjetoSoftware extends Projeto {

    @Override
    public String verificarStatus() {
        if (this.calcularPercentualConcluido() >= 90.0f) {
            return "Concluído";
        } else if (this.calcularPercentualConcluido() >= 60.0f) {
            return "Em Andamento";
        } else {
            return "Planejado";
        }
    }

    @Override
    public String getTipo() {
        return "ProjetoSoftware";
    }
}
