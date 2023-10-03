package org.example.task4;

import java.util.stream.Stream;

public class RandomAlgorithm {
       public static void main(String[] args) {
              long a = 25214903917l;
              long c = 11l ;
              long m = (long) Math.pow(2, 48);

              Stream<Long> randomNumbers = linearCongruentialGenerator( a, c, m);
              randomNumbers.limit(10).forEach(System.out::println);


       }

       public static Stream<Long> linearCongruentialGenerator( long a, long c, long m) {
              return Stream
                      .iterate(System.currentTimeMillis(), xn -> (a + xn + c) % m);
       }
}
