package introduction.n03_methods;

public class Step02_Signature {

    public static void main(String[] args) {

        /* Assinatura:
        *  É a identificação única do métoodo, composta por:
        *  - Nome do métoodo
        *  - Lista de parâmetros(tipo, ordem e quantidade)
        * */


        example("Gabriel", 25);
        example(25, "Gabriel");

    }

    private static void example(String name, Integer age){
        System.out.printf("My name is %s. I'm %d years old %n", name, age);
    }

    private static void example(Integer age, String name){
        System.out.printf("My name is %s. I'm %d years old %n", name, age);
    }
}
