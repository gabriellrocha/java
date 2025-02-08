package introduction.n03_methods;

public class Step08_MethodStaticInterface {

    public static void main(String[] args) {

        // Desde o Java 8, Interfaces podem ter métodos Static
        // Diferente de métodos default não podem ser sobrescritos
        // Acesso via Interface

        PaymentProcess payment = new CreditCardPayment();

        PaymentProcess.initialize();
        payment.processPayment(1500.0);


    }
}

interface PaymentProcess {

    static void initialize() {
        System.out.println("Initializing payment process...");
    }

    default void processPayment(double amount){
        System.out.printf("Process payment of $%.2f%n", amount);
    }
}

class CreditCardPayment implements PaymentProcess{


}