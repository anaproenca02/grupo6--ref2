package br.com.valueprojects.app;

import br.com.valueprojects.dao.EstimativaJavaDao;
import br.com.valueprojects.dominio.*;
import br.com.valueprojects.infra.EmissorDeSms;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setIdTarefa(1);
        tarefa.setDescricaoTarefa("Criar API de cadastro de clientes");
        tarefa.setMetricaTarefa(120.0);


        CriadorEstimativaJava criador = new CriadorEstimativaJava(Arrays.asList(
                new EmissorDeSms(),
                new EstimativaJavaDao()
        ));

        EstimativaJava estimativa = criador.cria(tarefa);

        System.out.println("Resultado final da estimativa: " + estimativa);
    }
}