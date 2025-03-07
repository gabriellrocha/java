package types_of_classes;

import java.util.Objects;

public class Type1_Record {

    /* Record - Tipo de classe imutável que encapsula dados de forma concisa, gerando
    automaticamente equals(), hashCode() e toString()

        - Gera um úncio construtor que recebe todos os atributos na ordem definida
        - Pode ter construtores compacto (permite adicionar lógica de validação)
        - Sem necessidade de getters - Métodos de acesso. Ex: Person.name()
        - Úteis p/ DTOs e valores imutáveis
    */

    public static void main(String[] args) {

        new Person("Gabriel", 25);
        new Person(null, 30);

    }
}

record Person(String name, Integer age){

    public Person {
        if (Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
    }

}
