package DataStructure.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step01_ArrayListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Gabriel", "Maria", "João"));

        names.add("Lucas"); // add ao final - return boolean
        names.add(3, "ana"); // add no índice específicado - return void

        String s = names.get(2);
        String s1 = names.set(0, "Rebeca");// add no índice específicado - return elemento


    }
}
