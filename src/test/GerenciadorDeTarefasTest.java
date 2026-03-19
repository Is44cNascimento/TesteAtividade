package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GerenciadorDeTarefasTest {

    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    void setUp() {
        gerenciador = new GerenciadorDeTarefas();
    }

    @Test
    void deveAdicionarUmaTarefa() {
        gerenciador.adicionarTarefa("Estudar Collections");

        assertTrue(gerenciador.verificarTarefa("Estudar Collections"));
        assertEquals(1, gerenciador.listarTarefas().size());
    }

    @Test
    void deveRemoverUmaTarefaExistente() {
        gerenciador.adicionarTarefa("Ler capitulo de testes");

        boolean removeu = gerenciador.removerTarefa("Ler capitulo de testes");

        assertTrue(removeu);
        assertFalse(gerenciador.verificarTarefa("Ler capitulo de testes"));
    }

    @Test
    void naoDeveRemoverUmaTarefaInexistente() {
        gerenciador.adicionarTarefa("Praticar Java");

        boolean removeu = gerenciador.removerTarefa("Tarefa inexistente");

        assertFalse(removeu);
        assertEquals(1, gerenciador.listarTarefas().size());
    }

    @Test
    void deveListarTodasAsTarefas() {
        gerenciador.adicionarTarefa("Estudar POO");
        gerenciador.adicionarTarefa("Resolver lista de exercicios");

        List<String> tarefas = gerenciador.listarTarefas();

        assertEquals(2, tarefas.size());
        assertEquals("Estudar POO", tarefas.get(0));
        assertEquals("Resolver lista de exercicios", tarefas.get(1));
    }

    @Test
    void deveVerificarSeUmaTarefaExiste() {
        gerenciador.adicionarTarefa("Treinar para a prova");

        assertTrue(gerenciador.verificarTarefa("Treinar para a prova"));
        assertFalse(gerenciador.verificarTarefa("Fazer compras"));
    }
}

