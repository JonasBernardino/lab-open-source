import list.OperacoesBasicas.tarefa.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Programar");
        System.out.println( listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();


    }
}