package java8.lambdas;

public class Step04_MethodInvocationContext {

    public static void main(String[] args) {

        // Method Invocation Context
        // A expressão lambda é passada como argumento para um métoodo que espera um interface funcional

        execute(() -> System.out.println("Completed"));

    }


    static void execute(Runnable runnable) {
        runnable.run();
    }
}
