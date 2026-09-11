/**
 * Classe que implementa as quatro operações matemáticas básicas.
 */
public class Caculadora_202021250030 {

    /**
     * Realiza a soma de dois números.
     */
    public double soma(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a multiplicação de dois números.
     */
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a subtração de dois números.
     */
    public double subtracao(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @throws ArithmeticException quando o divisor for zero.
     */
    public double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
