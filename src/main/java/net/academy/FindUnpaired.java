package net.academy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

class FindUnpaired {

    /**
     * Filter the original array and returns the array of elements that do not have a pair i.e matching opposite number.
     * TODO: what to do with zeros?
     * @param numbers
     * @return
     */
    static Integer[] findUnpaired(Integer[] numbers) {
        if(null == numbers) {
            throw new IllegalArgumentException("'numbers' array cannot be null");
        }
        HashMap<Integer, Integer> unpaired = new HashMap<>();
        for (int i : numbers) {
            if (unpaired.containsKey(-i)) {
                unpaired.compute(-i, (k, v) -> (v - 1 == 0) ? null : --v);
            } else {
                unpaired.merge(i, 1, Integer::sum);
            }
        }

        List<Integer> list = new ArrayList<>();
        unpaired.forEach((k, v) -> IntStream.range(0, v).forEach(i -> list.add(k)));
        return list.toArray(new Integer[unpaired.size()]);
    }
}
