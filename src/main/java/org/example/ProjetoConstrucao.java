package org.example;

public class ProjetoConstrucao extends Projeto {

    @Override
    public String verificarStatus() {
        if (this.calcularPercentualConcluido() >= 80.0f) {
            return "Concluído";
        } else if (this.calcularPercentualConcluido() >= 50.0f) {
            return "Em Andamento";
        } else {
            return "Planejado";
        }
    }
}

