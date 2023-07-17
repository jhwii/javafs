package a0717;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tran {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2013, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        System.out.println("모든 데이터" + transactions);
        System.out.println();

        // 1. 2011년에 일어난 모든 트랜잭션 검색 후 값을 오름차순 검색
        List<Transaction> tran01 = transactions.stream()
                .filter(item -> item.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(tran01);
        System.out.println();

        // 1. stream() 메서드를 호출해서 transactions 리스트를 스트림으로 변환
        // 2. item.getYear()==2011를 사용해서 2011년에 일어난 트랜잭션만 필터링
        // 3. Transaction 객체의 value 값을 기준으로 오름차순으로 정렬합니다.
        // collect(Collectors.toList()); 정렬된 트랜잭션을 리스트로 수집하여 trans01

        // 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
        List<String> tran02 = transactions.stream()
                // .map(Transaction::getTrader)
                // .map(Trader::getCity)
                .map(item -> item.getTrader().getCity())
                .distinct().collect(Collectors.toList());

        System.out.println(tran02);
        System.out.println();

        // 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        // List<Trader> tran03 = transactions.stream()
        // .map(Transaction::getTrader)
        // .filter(trader -> trader.getCity().equals("Cambridge"))
        // .sorted(Comparator.comparing(Trader::getName))
        // .collect(Collectors.toList());

        // System.out.println(tran03);

        List<Trader> trader03 = transactions.stream()
                .map(Transaction::getTrader) // 트랜잭션의 거래자 정보를 추출
                .filter(item -> "Cambridge".equals(item.getCity()))
                .sorted(Comparator.comparing(Trader::getName)) // 이름순으로 정렬
                .distinct()
                .collect(Collectors.toList());

        System.out.println(trader03);
        System.out.println();

        // 4. 모든 거래자의 이름 알파벳순 정렬
        // List<String> trader04 = transactions.stream()
        // .map(Transaction::getTrader)
        // .map(Trader::getName)
        // .distinct()
        // .sorted()
        // .collect(Collectors.toList());

        // System.out.println(trader04);

        List<String> trader04 = transactions.stream()
                .map(a -> a.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(trader04);
        System.out.println();

        // 5. 밀라노에 거래자가 있는가?
        boolean trader05 = transactions.stream()
                .anyMatch(item -> "Milan".equals(item.getTrader().getCity()));

        System.out.println("밀라노에 거래자가 있는지 여부 " + trader05);
        System.out.println();

        // 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        List<Integer> trader06 = transactions.stream()
                .filter(item -> "Cambridge".equals(item.getTrader().getCity()))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println("케임브리지에 거주하는 거래자의 모든 트랜잭션 값 출력:" + trader06);
        System.out.println();

        // 전체 트랜잭션 중 최댓값은?
        Optional<Integer> trader07 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println("전체 트랜잭션 중 최댓값:" + trader07);
    }
}
