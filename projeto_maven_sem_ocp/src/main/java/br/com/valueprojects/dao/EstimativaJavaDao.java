package br.com.valueprojects.dao;

import br.com.valueprojects.dominio.AcaoAposGerarEstimativa;
import br.com.valueprojects.dominio.EstimativaJava;

public class EstimativaJavaDao implements AcaoAposGerarEstimativa {

    @Override
    public void executa(EstimativaJava estJava) {

        System.out.println("Estimativa salva no banco: " + estJava);
    }
}