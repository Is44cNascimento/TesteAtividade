package test;

import main.GerenciadorDeTarefas;
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
        gerenciador.adicionarTarefa("JUnit");

        assertTrue(gerenciador.verificarTarefa("JUnit"));
        assertEquals(1, gerenciador.listarTarefas().size());
    }

    @Test
    void deveRemoverUmaTarefaExistente() {
        gerenciador.adicionarTarefa("Java");

        boolean removeu = gerenciador.removerTarefa("Java");

        assertTrue(removeu);
        assertFalse(gerenciador.verificarTarefa("Java"));
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
        gerenciador.adicionarTarefa("B");
        gerenciador.adicionarTarefa("A");

        List<String> tarefas = gerenciador.listarTarefas();

        assertEquals(2, tarefas.size());
        assertEquals("B", tarefas.get(0));
        assertEquals("A", tarefas.get(1));
    }

    @Test
    void deveVerificarSeUmaTarefaExiste() {
        gerenciador.adicionarTarefa("Teste");

        assertTrue(gerenciador.verificarTarefa("Teste"));
        assertFalse(gerenciador.verificarTarefa("Ucsal"));
    }

    @Test
    void deveVerficarSeEstaVazio(){
        gerenciador.adicionarTarefa("Teste");

        List<String> tarefas = gerenciador.listarTarefas();
        boolean estaVazio = tarefas.isEmpty();

        assertFalse(estaVazio);

    }
}

