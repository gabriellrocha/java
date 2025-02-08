package introduction.n03_methods;

public class Step03_MethodOverloading {

    public static void main(String[] args) {

        // Sobrecarga
        // Métodos com o mesmo nome na mesma classe, mas com lista de parâmetros diferentes
        // São usados para realizar tarefas semelhantes, mas que tratam diferentes tipos de entrada. Exemplo:


        Math math = new Math();
        int result = math.add(2, 3, 5);
        int result1 = math.add(5, 8);


    }
}

class Math {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}
