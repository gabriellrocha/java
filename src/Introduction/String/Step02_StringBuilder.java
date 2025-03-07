package Introduction.String;

public class Step02_StringBuilder {

    public static void main(String[] args) {

        // Versão de String mutável (melhor desempenho quando há muitas operações de concatenação)
        // Não-Thread-Safe

        String result = new StringBuilder("Java suporta programação: ")
                .append("orientada a objetos, ")
                .append("multithreading, ")
                .append("genérica e ")
                .append("funcional")
                .toString();

        System.out.println(result);

    }
}
