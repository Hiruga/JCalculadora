public class Operacoes {

    public double soma(double n1, double n2) {return n1 + n2;}
    public double subtracao (double n1, double n2) {return n1 - n2;}
    public double multiplicacao (double n1, double n2) {return n1 * n2;}
    public double divisao (double n1, double n2) {
        if (n2 == 0) throw new ArithmeticException("Divisão por zero");
        return n1 / n2;
    }
}
