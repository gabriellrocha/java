package introduction.n04_operators;

public class Step06_Casting {
    public static void main(String[] args) {

//         Usado para converter um tipo de dado em outro
//         (Tipo) variável

//         Pode ser implícito ou explícito

//         Implícito em tipos primitivos:
//         Quando o tipo de destino é mais 'largo'(em bits) que o tipo de origem. Exemplo:    

            int numberInt32Bits = 15000;
            long numberLong64Bits = numberInt32Bits;


//          Explícito em tipos primitivos: (envolve perda de informações)
//          Quando o tipo de destino é 'menor'(em bits) que o tipo de origem.Exemplo:

            short numberShort16Bits = 32000;
            byte numberByte8Bits = (byte) numberShort16Bits; // valor Truncado


//          Extra: char para Int (O tipo char guarda o valor ASCII de um caractere)

            char charSymbol = 'A';
            int ascii = charSymbol; // 65
    }
}
