package Introduction.Operators;

public class Step08_Downcasting {

    public static void main(String[] args) {

        // Continuando...

        // Downcasting (Explícito) - Quando converte um tipo mais genérico para um tipo mais específico
        // Pode lançar uma ClassCastException - Evite downcasting


        Automobile automobile = new Car();

        if(automobile instanceof Car) {  // verificação de segurança
            Car car = (Car) automobile;
            System.out.println("Downcasting ok!");
        }



    }
}

class Automobile {

}

class Car extends Automobile {

}

