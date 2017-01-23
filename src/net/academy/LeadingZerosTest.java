package net.academy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LeadingZerosTest {

    private int[] array;

    @Before
    public void init() {
        array = new int[]{2, 3, 2, 9, 3, 0, 5, 6, 5, 6, 0, 2, 4, 1, 5, 7, 4, 4, 7, 6, 0, 2, 5, 4, 8, 2, 3, 6, 4, 8, 7, 0, 9, 3, 5, 6, 8, 7, 9, 6, 1, 1, 4, 3, 9, 4, 2, 1, 4, 3, 1, 2, 0, 3, 1, 9, 0, 1, 6, 1, 0, 0, 8, 9, 3, 2, 2, 4, 0, 5, 7, 2, 1, 5, 8, 4, 9, 1, 8, 5, 4, 7, 4, 3, 7, 4, 8, 7, 5, 0, 6, 2, 2, 6, 0, 1, 1, 0, 8, 9};
    }

    @Test
    public void swap() throws Exception {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));

        LeadingZeros.swap(arrayCopy);
        System.out.println(Arrays.toString(arrayCopy));

        List fromArray = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        List fromArrayCopy = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        assertTrue(fromArray.containsAll(fromArrayCopy) && fromArrayCopy.containsAll(fromArray));
    }

    @Test
    public void swapFromBackwards() throws Exception {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));

        LeadingZeros.swapFromBackwards(arrayCopy);
        System.out.println(Arrays.toString(arrayCopy));


        List fromArray = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        List fromArrayCopy = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        assertTrue(fromArray.containsAll(fromArrayCopy) && fromArrayCopy.containsAll(fromArray));
    }

}