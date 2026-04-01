package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.AcaoAposGerarEstimativa;
import br.com.valueprojects.dominio.EstimativaJava;

public class EmissorDeSms implements AcaoAposGerarEstimativa {
    @Override
    public void executa(EstimativaJava estJava) {
        System.out.println("SMS enviado com a estimativa: " + estJava);
    }
}