package Java8.Lambdas;

public class Step01_Lambdas {

    // (parâmetros) -> expressão


    public static void main(String[] args) {

        // Implementação de interface funcional sem Lambda - Utilizando classe separada

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
