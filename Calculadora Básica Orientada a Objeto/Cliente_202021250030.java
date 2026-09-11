/**
 * Cliente que utiliza a biblioteca Caculadora_202021250030.
 */
public class Cliente_202021250030 {

    public static void main(String[] args) {
        Caculadora_202021250030 calculadora = new Caculadora_202021250030();

        double a = 20;
        double b = 5;

        System.out.println("=== Calculadora 202021250030 ===");
        System.out.println("Números utilizados: " + a + " e " + b);
        System.out.println("Soma: " + calculadora.soma(a, b));
        System.out.println("Subtração: " + calculadora.subtracao(a, b));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(a, b));
        System.out.println("Divisão: " + calculadora.divisao(a, b));
    }
}
