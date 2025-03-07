package Java8.Streams.Operations.Terminal.Collect;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step04_CollectorsSummarizing {

    /*
        summarizing() - Utilizado para obter várias estatísticas sobre os valores
        numéricos no Stream, como: soma, média, mínimo, máximo, contagem

         Retorna um objeto do tipo IntSummaryStatistics, DoubleSummaryStatistics ou LongSummaryStatistics
    */

    public static void main(String[] args) {

        IntSummaryStatistics intSummaryStatistics = Stream.of(1, 20, 3, 4, 5, 6, 7, 8, 9, 100).collect(
                Collectors.summarizingInt(Integer::intValue));

        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getCount());
    }
}
