package com.ice.bondedge.bondticks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PairsApplication {

    public static void main(String[] args) {

        SpringApplication.run(PairsApplication.class, args);

        DistinctPairs distinctPairs = new DistinctPairs();
        Integer[] integers_1 = {1, 2, 3, 4, 5, 6};
        distinctPairs.sumPairs(integers_1);

        Integer[] integers_2 = {1, 6};
        distinctPairs.sumPairs(integers_2);

        Integer[] integers_3 = {1, 2, 3, 4};
        distinctPairs.sumPairs(integers_3);

        Integer[] integers_4 = {2, 3, 4, 5, 6};
        distinctPairs.sumPairs(integers_4);

        Integer[] integers_5 = {1, 2, 3};
        distinctPairs.sumPairs(integers_5);
    }

}
