package DataStructure.Collection.List;

import java.util.Arrays;
import java.util.Vector;

public class Step01_Vector {

    public static void main(String[] args) {

        // Vector - Foi criado como uma lista dinâmica thread-safe

        // Caiu em desuso, pois:
        // A alternativas melhores. API java.util.concurrent
        // Dobre de tamanho 2x enquanto Arraylist cresce 1.5x
        // métodos legado


        Vector<String> vector = getVector();
        vector.addElement("Limão"); // legado, dentro outros...


    }

    private static Vector<String> getVector() {
        return new Vector<>(Arrays.asList("Manga", "Uva", "Mamão", "Laranja"));
    }
}
