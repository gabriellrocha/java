package java8.lambdas;

public class Step02_FunctionalInterface {

    // Caracterizada por:
    /*
        - Um único métoodo abstrado - Este é o comportamento que será implementado
        - @FunctionalInterface - Opcional, mas recomendado. Impede que mais métodos abstratos estejam presentes
        - Pode conter métodos concretos (default, static)

        Padrão SAM (Single Abstract Method)
    * */


    public static void main(String[] args) {

        InterfaceExample myInterface = System.out::println; // implementação

        myInterface.say("I'm learning functional java");

        myInterface.sayDefault("....");

        InterfaceExample.sayStatic("...");
    }

}

@FunctionalInterface
interface InterfaceExample {

    // Padrão SAM

    void say(String message);

    static void sayStatic(String message) {
        System.out.println("I'm static method. You say " +message);
    }

    default void sayDefault(String message) {
        System.out.println("I'm default method. You say " + message);
    }
}