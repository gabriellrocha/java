package java8.lambdas;

public class Step03_AssignmentContextDemo {


    public static void main(String[] args) {

        // Assignment Context - A expressão lambda é atribuída diretamente a uma variável do tipo funcional

        Runnable task = () -> System.out.println("Running");

    }
}
