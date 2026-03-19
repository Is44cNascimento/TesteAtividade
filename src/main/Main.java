public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Fazer exercicios de JUnit");

        System.out.println("Tarefas cadastradas:");
        for (String tarefa : gerenciador.listarTarefas()) {
            System.out.println("- " + tarefa);
        }

        System.out.println("\nExiste 'Estudar Java'? " + gerenciador.verificarTarefa("Estudar Java"));
        gerenciador.removerTarefa("Estudar Java");
        System.out.println("Existe 'Estudar Java' apos remocao? " + gerenciador.verificarTarefa("Estudar Java"));
    }
}

