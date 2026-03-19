package main;


public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        gerenciador.adicionarTarefa("Java");
        gerenciador.adicionarTarefa("JUnit");

        System.out.println("Tarefas cadastradas:");
        for (String tarefa : gerenciador.listarTarefas()) {
            System.out.println("- " + tarefa);
        }

        System.out.println("\nExiste 'Java'? " + gerenciador.verificarTarefa("Java"));
        gerenciador.removerTarefa("Java");
        System.out.println("Existe 'Java' apos remocao? " + gerenciador.verificarTarefa("Java"));
    }
}

