
import atividades.Atividade;

public class MaquinaWorkflow {
    public void executar(Workflow workflow) {
        for (Atividade atividade : workflow.getAtividades()) {
            atividade.executar();
        }
    }

    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.registrarAtividade(new atividades.CarregarVideo());
        workflow.registrarAtividade(new atividades.CodificarVideo());
        workflow.registrarAtividade(new atividades.EnviarEmail());
        workflow.registrarAtividade(new atividades.ModificarStatusVideo());

        MaquinaWorkflow maquina = new MaquinaWorkflow();
        maquina.executar(workflow);
    }
}

