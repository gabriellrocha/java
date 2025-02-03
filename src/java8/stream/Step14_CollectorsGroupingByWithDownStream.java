package java8.stream;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Step14_CollectorsGroupingByWithDownStream {

    public static void main(String[] args) {

        /* groupingBy - Suporta a COMBINAÇÃO com outros coletores, permitindo
         OPERAÇÕES ADICIONAIS sobre os grupos*/

        Map<Smartphone.Brand, DoubleSummaryStatistics> result = getSmartphones().stream()
                .collect(Collectors.groupingBy(
                        Smartphone::brand,
                        Collectors.summarizingDouble(Smartphone::price)  // coletor downstream
                ));

        System.out.println(result);



        /* downstream - É um coletor que é aplicado SOBRE OS GRUPOS, permitindo algum tipo de
         agregação ou transformação adicional */

    }


    private static List<Smartphone> getSmartphones() {

        return List.of(
                new Smartphone("Galaxy S24 ULTRA", 1150.0, Smartphone.Brand.SAMSUNG),
                new Smartphone("IPHONE 15", 1250.0, Smartphone.Brand.APPLE),
                new Smartphone("Razr", 800.0, Smartphone.Brand.MOTOROLA),
                new Smartphone("IPhone SE", 450.0, Smartphone.Brand.APPLE),
                new Smartphone("Galaxy Z Fold 5", 1790.0, Smartphone.Brand.SAMSUNG),
                new Smartphone("Edge+", 999.0, Smartphone.Brand.MOTOROLA),
                new Smartphone("IPhone 14 Pr", 900.0, Smartphone.Brand.APPLE),
                new Smartphone("Moto G Power", 250.0, Smartphone.Brand.MOTOROLA),
                new Smartphone("Galaxy S23 Ultra", 1000.0, Smartphone.Brand.SAMSUNG)
        );
    }
}

record Smartphone(String name, Double price, Brand brand){

     enum Brand {

        SAMSUNG,
        APPLE,
        MOTOROLA
    }
}
