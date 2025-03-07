package Introduction.Methods;

public class Step06_Abstract {

    public static void main(String[] args) {

        // Methods Abstract
        /* - São métodos sem implementação(sem corpo) definidos em classes abstratas ou interfaces
           - Obrigam as subclasses a fornecerem uma implementação específica
        */

    }
}

abstract class Vehicle {

    abstract void accelerate();
}

interface Drivable {
    public abstract void drive();
}

class Car extends Vehicle implements Drivable {
    @Override
    void accelerate() {
        System.out.println("Accelerating.....vrum vrum");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }
}