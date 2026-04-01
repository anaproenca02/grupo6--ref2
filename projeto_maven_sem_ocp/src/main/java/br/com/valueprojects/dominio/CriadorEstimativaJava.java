package br.com.valueprojects.dominio;

import java.util.List;

public class CriadorEstimativaJava {

    private final List<AcaoAposGerarEstimativa> acoes;


    public CriadorEstimativaJava(List<AcaoAposGerarEstimativa> acoes) {
        this.acoes = acoes;
    }

    public EstimativaJava cria(Tarefa tarefa) {
        double metrica = tarefa.getMetricaTarefa();

        EstimativaJava estJava = new EstimativaJava(
                metrica,
                produtividadeDesenvolvedorJunior(metrica)
        );

        for (AcaoAposGerarEstimativa acao : acoes) {
            acao.executa(estJava);
        }

        return estJava;
    }

    private double produtividadeDesenvolvedorJunior(double metrica) {
        return metrica * 0.04;
    }
}