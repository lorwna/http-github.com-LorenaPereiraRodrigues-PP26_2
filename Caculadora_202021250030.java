/**
 * Adapter por Herança.
 *
 * Adapta a interface da Calculadora_202321250008 para a interface
 * que o Cliente_202021250030 já utilizava na calculadora perdida.
 */
public class Caculadora_202021250030 extends Calculadora_202321250008 {

    /** Adapta "somar" para "soma". */
    public double soma(double a, double b) {
        return somar(a, b);
    }

    /** Adapta "subtrair" para "subtracao". */
    public double subtracao(double a, double b) {
        return subtrair(a, b);
    }

    /** Adapta "multiplicar" para "multiplicacao". */
    public double multiplicacao(double a, double b) {
        return multiplicar(a, b);
    }

    /** Adapta "dividir" para "divisao". */
    public double divisao(double a, double b) {
        return dividir(a, b);
    }
}
