import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeTarefas {
    private final List<String> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        if (tarefa == null || tarefa.isBlank()) {
            return;
        }
        tarefas.add(tarefa);
    }

    public boolean removerTarefa(String tarefa) {
        return tarefas.remove(tarefa);
    }

    public List<String> listarTarefas() {
        return Collections.unmodifiableList(tarefas);
    }

    public boolean verificarTarefa(String tarefa) {
        return tarefas.contains(tarefa);
    }
}

