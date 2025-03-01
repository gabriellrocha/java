package java8.streams.operations.terminal.collect;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Step06_CollectorsDownStream {

    /* Downstream: É um coletor aplicado sobre os grupos formados pelo groupingBy(),
     permitindo realizar operações de agregação ou transformação adicionais em cada grupo.

     downstreams comuns incluem counting(), summarizingInt(), summingInt(), averagingInt(),
     maxBy(), minBy(), entre outros

    */

    public static void main(String[] args) {

        Map<Smartphone.Brand, Double> totalPriceByBrand = getSmartphones().stream()
                .collect(Collectors.groupingBy(
                        Smartphone::brand,  // Agrupa pelos nomes das marcas - neste ponto temos: Map<Brand, List<Smartphone>>
                        Collectors.summingDouble(Smartphone::price)  // downstream - soma o preço dos smartphones de cada marca
                ));

        System.out.println(totalPriceByBrand);



        Map<Smartphone.Brand, DoubleSummaryStatistics> statsByBrand = getSmartphones().stream()
                .collect(Collectors.groupingBy(
                        Smartphone::brand,  // Agrupa pelos nomes das marcas - neste ponto temos: Map<Brand, List<Smartphone>>
                        Collectors.summarizingDouble(Smartphone::price)  // downstream - aplica summarizingDouble p/ estatísticas dos preços
                ));

        System.out.println(statsByBrand);

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
