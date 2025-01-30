package java8.lambdas;

public class Step01_Lambdas {

    /* Lambda expression em Java são funções anônimas usadas para simplificar
     a implementação de interfaces funcionais */

    // (parâmetros) -> expressão


    public static void main(String[] args) {

        // Utilizando implementação de interface funcional sem Lambda

        Calculo somar = new Somar();
        System.out.println(somar.executar(5, 5));

        Calculo multiplicar = new Multiplicar();
        System.out.println(multiplicar.executar(6, 8));


        // Implementando interface funcional com Lambda

        Calculo soma = (a, b) -> {
            return a + b;
        };
        soma.executar(6, 9);

        // Lambda com apenas uma expressão é permitido omitir o par de {} e o return
        Calculo multi = (n1, n2) -> n1 * n2;
        multi.executar(8, 9);
    }

}

class Somar implements Calculo {

    public double executar(double number1, double number2) {
        return number1 + number2;
    }
}

class Multiplicar implements Calculo {

    public double executar(double number1, double number2) {
        return number1 * number2;
    }
}
