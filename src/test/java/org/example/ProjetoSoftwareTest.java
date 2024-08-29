package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoSoftwareTest {

    @Test
    void deveRetornarConcluido() {
        ProjetoSoftware projeto = new ProjetoSoftware();
        projeto.setProgressoAtual(95.0f);
        projeto.setProgressoFinal(100.0f);
        assertEquals("Concluído", projeto.verificarStatus());
    }

    @Test
    void deveRetornarEmAndamento() {
        ProjetoSoftware projeto = new ProjetoSoftware();
        projeto.setProgressoAtual(65.0f);
        projeto.setProgressoFinal(100.0f);
        assertEquals("Em Andamento", projeto.verificarStatus());
    }

    @Test
    void deveRetornarPlanejado() {
        ProjetoSoftware projeto = new ProjetoSoftware();
        projeto.setProgressoAtual(50.0f);
        projeto.setProgressoFinal(100.0f);
        assertEquals("Planejado", projeto.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        ProjetoSoftware projeto = new ProjetoSoftware();
        projeto.setProgressoAtual(70.0f);
        projeto.setProgressoFinal(100.0f);
        projeto.setNome("Desenvolvimento de Aplicativo");
        assertEquals("ProjetoSoftware{nome='Desenvolvimento de Aplicativo', progresso=Em Andamento}", projeto.getInfo());
    }
}
