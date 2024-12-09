package introducao;

@SuppressWarnings("all")
public class Step14_OperadoresLogicos {

    public static void main(String[] args) {

        // Usados para combinar ou negar expressões booleanas
        // Expressão booleana tem como retorno um valor booleano (true ou false)

        // NOT (!) - operador unário que inverte o valor booleano

        boolean operadorNotOne = !true; // false
        boolean operadorNotTwo = !false; // true


        // AND (&&) - operador binário que retorna true se AMBOS operandos forem true

        boolean b0 = true && true; // true
        boolean b1 = false && false; // false
        boolean b2 = false && true;  // false
        boolean b3 = true && false;  // false


        // OR  (||) - operador binário que retorna true se pelo menos um operando for true

        boolean c0 = true || false; // true
        boolean c1 = false || true; // true
        boolean c2 = true || true; // true
        boolean c3 = false || false; // false


        // XOR - (OR exclusivo) (^) - operador binário que retorna true se operandos booleanos tem valores DIFERENTES

        boolean d0 = true ^ false;  // true
        boolean d1 = false ^ true;  // true
        boolean d2 = true ^ true;   // false
        boolean d3 = false ^ false; // false


        // Ordem de precedêcia

        // ! (NOT), ^ (XOR), && (AND), || (OR)


        // Short-circuiting
        // Os operadores && e || não avaliam o segundo argumento se não for necessário - reduz tempo de computação


    }
}
