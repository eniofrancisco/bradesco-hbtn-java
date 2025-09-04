import java.util.ArrayList;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas;

    // Construtor
    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    // Adiciona uma tarefa à lista
    public void adicionarTarefa(Tarefa novaTarefa) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == novaTarefa.getIdentificador()) {
                throw new IllegalArgumentException(
                    "Tarefa com identificador " + novaTarefa.getIdentificador() + " ja existente na lista"
                );
            }
        }
        tarefas.add(novaTarefa);
    }

    // Marca uma tarefa como feita
    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.marcarFeita();
                return true;
            }
        }
        return false;
    }

    // Desfaz uma tarefa
    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.desfazer();
                return true;
            }
        }
        return false;
    }

    // Marca todas como não feitas
    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.desfazer();
        }
    }

    // Marca todas como feitas
    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.marcarFeita();
        }
    }

    // Lista todas as tarefas
    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            String status = tarefa.isEstahFeita() ? "[X]" : "[ ]";
            System.out.println(status + "  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        }
    }
}
