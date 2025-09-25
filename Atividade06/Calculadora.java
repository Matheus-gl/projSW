public class Calculadora {
    double v1, v2;
    String operacao;

    public Calculadora(double v1, double v2, String operacao) {
        this.v1 = v1;
        this.v2 = v2;
        this.operacao = operacao;
    }

    public double adicao (double var1, double var2){
        return var1 + var2;
    }

    public double subtracao (double var1, double var2){
        return var1 - var2;
    }

    public double divisao (double var1, double var2){
        return var1 / var2;
    }

    public double multiplicacao (double var1, double var2){
        return var1 + var2;
    }

    public double exponenciacao (double var1, double var2){
        return Math.pow(var1, var2);
    }
}
