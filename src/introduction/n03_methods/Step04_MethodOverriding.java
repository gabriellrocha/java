package introduction.n03_methods;

public class Step04_MethodOverriding {

    public static void main(String[] args) {

        // Sobrescrita. (Requer herança)
        // Quando um métoodo da classe pai é 'reimplantado' na classe filha
        // Permite personalizar o comportamento. (quando a subclasse precisa fornecer uma implementação específica)

        Dog dog = new Dog();
        dog.makeSound();

    }
}

class Animal {

    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {

    @Override           // @Override garante a integridade
    void makeSound() {
        System.out.println("Barking");
    }
}
