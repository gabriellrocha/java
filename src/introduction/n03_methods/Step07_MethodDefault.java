package introduction.n03_methods;

public class Step07_MethodDefault {

    public static void main(String[] args) {

        // Desde o Java 8, Interfaces podem ter métodos com implementação 'default'
        // Somente em Interfaces
        // As classes que implementam a interface pode sobrescrever se necessário


        Motorcycle motorcycle = new Motorcycle();
        motorcycle.drive();


    }
}

interface Drivablee {

    default void drive() {
        System.out.println("Driving with default behavior");
    }
}

class Motorcycle implements Drivablee {

    // Pode optar por não sobrescrever o métoodo
}
