package Introduction.DataTypes.Reference;

import java.util.ArrayList;
import java.util.List;

public class Step01_Types {

    public static void main(String[] args) {

        /* Tipos referência armazenam 'endereços de memória' que apontam para objetos reais no HEAP

          - Objetos são criados na memória heap, e a variável armazena um ponteiro para o mesmo
          - Duas variáveis podem apontar para o mesmo Objeto, refletindo mudanças em ambas
          - Quando um objeto não tem mais uma referência apontando pra ele, o coletor(Garbage-collector)
            de lixo remove-o da memória(processo automático - lógica própria)
          - null = ausência de referência
            */

        // Os tipos de referência são:

        // Qualquer Objeto
        Integer integer = 10;

        // Interfaces
        List<String> list = new ArrayList<>();

        // Array
        String[] names = {"Gabriel", "Maria"};
        String[] names2 = new String[3];


        // toString()
        // Por padrão imprimi uma representação textual do objeto [NomeDaClasse]@[CódigoHash]

        User user = new User();
        System.out.println(user); // Exemplo: User@2c7b84de

    }
}

class User {
}
