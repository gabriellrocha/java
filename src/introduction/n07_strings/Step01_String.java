package introduction.n07_strings;

@SuppressWarnings("All")
public class Step01_String {

    public static void main(String[] args) {

        // Usado para representar palavras
        // É imutável (operações com String gera uma nova String)

        String name = new String("Gabriel");      // armazenado no Heap - ineficiente
        String namee = "Gabriel";                        // armazenado no String Pool

        // String Pool é uma área da memória(dentro do Heap) onde são armazendas as Strings literais

        // Concatenação em String não é uma operação comutativa


    }
}
