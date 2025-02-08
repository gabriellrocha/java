package introduction.n04_operators;

public class Step07_Upcasting {

    public static void main(String[] args) {

        // Casting de referência

        /* Processo de converter um tipo de referência(como uma classe ou interface) para outro
            tipo de referência(geralmente para um tipo mais específico ou mais geral na
            hierarquia de herança de classes).
        */

        // Upcasting(Implícito) - Quando converte um tipo específico para um tipo mais genérico
        // Operação segura, pois, um subtipo sempre é um super tipo

        /* O sub tipo perde suas operações específicas. No entanto, o objeto ainda mantém sua
           implementação original de métodos sobrescritos(overriding)
        */

        Animal animal = new Dog();
        animal.eat();
//      animal.fetch();  // perde acesso

    }
}

abstract class Animal {

     protected void eat(){}

}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void fetch(){
        System.out.println("The dog went to fetch....");
    }
}

