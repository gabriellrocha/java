package introduction;

public class Step18_ForLoop {

    public static void main(String[] args) {

//         Quando precisamos repetir um bloco de código certo número de vezes usamos o For loop
//         Ou seja, sabemos de antemão a quantidade de repetições
//
//         Este loop também é usado para iterar sobre um Array, já que o mesmo é indexado
//
//         Sintaxe
//
//        for (initialization ; condition; modification) {
//
//        }
//            initialization - executada uma vez antes doo inicio do loop, normalmente as variáveis do loop
//            são inicializadas aqui

//            condition - operação booleana que define a necessidade da próxima interação

//            modification - altera a variável(decremento ou incremento) do loop, é invocada após cada interação do loop

            int startIncl = 1, endExclu = 11;
            int sum = 0;

            for (int i = startIncl; i < endExclu; i ++) {  // soma os valores de 1 a 10 (incluídos)
                sum += i;
            }

            // declaração de inicialização, a condição e as partes de modificação são opcionais



    }
}
