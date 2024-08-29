package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoConstrucaoTest {

    @Test
    void deveRetornarConcluido() {
        ProjetoConstrucao projeto = new ProjetoConstrucao();
        projeto.setProgressoAtual(85.0f);
        projeto.setProgressoFinal(100.0f);
        assertEquals("Concluído", projeto.verificarStatus());
    }

    @Test
    void deveRetornarEmAndamento() {
        ProjetoConstrucao projeto = new ProjetoConstrucao();
        projeto.setProgressoAtual(55.0f);
        projeto.setProgressoFinal(100.0f);
        assertEquals("Em Andamento", projeto.verificarStatus());
    }

    @Test
    void deveRetornarPlanejado() {
        ProjetoConstrucao projeto = new ProjetoConstrucao();
        projeto.setProgressoAtual(40.0f);
        projeto.setProgressoFinal(100.0f);
        assertEquals("Planejado", projeto.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        ProjetoConstrucao projeto = new ProjetoConstrucao();
        projeto.setProgressoAtual(55.0f);
        projeto.setProgressoFinal(100.0f);
        projeto.setNome("Construção de Ponte");
        assertEquals("Projeto{nome='Construção de Ponte', progresso=Em Andamento}", projeto.getInfo());
    }
}
