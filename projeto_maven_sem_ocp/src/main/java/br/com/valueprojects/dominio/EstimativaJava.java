package br.com.valueprojects.dominio;

public class EstimativaJava {

    private final double metrica;
    private final double produtividadeDesenvolvedorJunior;

    public EstimativaJava(double metrica, double produtividadeDesenvolvedorJunior) {
        this.metrica = metrica;
        this.produtividadeDesenvolvedorJunior = produtividadeDesenvolvedorJunior;
    }

    public double getMetrica() {
        return metrica;
    }

    public double getProdutividadeDesenvolvedorJunior() {
        return produtividadeDesenvolvedorJunior;
    }

    @Override
    public String toString() {
        return "EstimativaJava{" +
                "metrica=" + metrica +
                ", produtividadeDesenvolvedorJunior=" + produtividadeDesenvolvedorJunior +
                '}';
    }
}
