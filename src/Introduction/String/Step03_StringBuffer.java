package Introduction.String;

public class Step03_StringBuffer {

    public static void main(String[] args) {

        // Semelhante há StringBuilder, mas com métodos sincronizados
        // Mais lento devido a sincronização


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Sou ")
                .append("a versão segura para ")
                .append("ambientes multithreading");

        System.out.println(stringBuffer);
    }
}
