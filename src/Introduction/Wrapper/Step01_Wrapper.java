package Introduction.Wrapper;

public class Step01_Wrapper {

    public static void main(String[] args) {

        /* Wrapper é uma classe empacotadora conhecida como invólucro, que encapsula um tipo
        primitivo(ex: int) e o 'transforma' em objeto (ex: Integer)

        - Permite usar tipos primitivos em contextos onde objetos são exigidos como em coleções e generics

        * */

        // Toodo tipo primitivo tem uma classe empacotadora de tipo correspondente

        Boolean Objboolean = true;
        Byte objByte = 1;
        Short objShort = 4500;
        Character objCharacter = 'A';
        Double objDouble = 15.0;
        Float objFloat = 12.0F;
        Integer objInteger = 100;
        Long objLong = 12000L;
    }
}
