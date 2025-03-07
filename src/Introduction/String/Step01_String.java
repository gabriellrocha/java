package Introduction.String;

@SuppressWarnings("All")
public class Step01_String {

    /* Strings - São uma sequências de caracteres, como palavras ou frases, usadas para representar texto

       - É imutável uma vez criada: Operações com String gera uma nova String
       - Strings literais são armazendas no pool de strings
       - Pool de Strings(área dentro do heap): Conjunto de Strings armazenadas para reutilização
       - Concatenar Strings significa anexar uma String a outra
    */

    public static void main(String[] args) {

        String language = new String("Java");      // Ineficiente

        String framework = "Spring";                      // Armazenado no String Pool
        String framework2= "Spring";


        boolean result = framework == framework2;         // true - compara as referências, não o conteúdo
    }
}
