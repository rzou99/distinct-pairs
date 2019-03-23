package com.ice.bondedge.bondticks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctPairs {

    public void sumPairs(Integer[] input) {
        Map<Integer, Integer> distinctMap = new HashMap<>();

        printArray(input);
        for (Integer first : input) {
            for (Integer second : input) {
                if ((first + second) == 7) {
                    if (!matched(first, second, distinctMap)) {
                        System.out.println(first + ", " + second);

                        // store both pairs so that we will skip them next time
                        distinctMap.put(first, second);
                        distinctMap.put(second, first);
                    }
                }
            }
        }

    }

    private boolean matched(Integer first, Integer second, Map<Integer, Integer> map) {
        return (map.get(first) == first && map.get(second) == second) ||
                (map.get(second) == first && map.get(first) == second);
    }

    private void printArray(Integer[] input) {
        System.out.println("input: \n" + Stream.of(input).map(integer -> integer.toString()).collect(Collectors.joining(", ")) + "\noutput:");
    }

}
