package net.academy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class FindUnpairedTest {

    private Integer[] array;

    @Before
    public void init() {
        array = new Integer[]{0, -5, 6, 8, -10, 6, -6, 10, 10, 0, 3, 2, -10, 0, 2, 5, -2, 3, 3, -9, -1, -1, 0, 2, -3, -7, -4, -6, 4, 5, -5, -7, 1, 10, -9, 1, -4, -10, -3, -8, 7, 4, 4, -6, -3, -3, 7, -4, 7, -6, -7, 2, -8, -6, 5, 5, 7, 4, 1, -6, 2, -10, -6, 4, -6, -2, 4, 5, 0, 10, -8, 0, 1, 9, -3, -7, -1, -6, -7, 7, -10, -10, 10, -4, -5, 4, -4, -3, -2, -2, 5, 8, 7, 0, 4, -9, 7, -5, 7, 6};
    }

    @Test
    public void findUnpaired() throws Exception {
        System.out.println(Arrays.toString(array)); //debug
        Integer[] unpaired = FindUnpaired.findUnpaired(array);
        System.out.println(Arrays.toString(unpaired)); //debug
        Assert.assertTrue("all unpaired elements must be present in original array",
                Arrays.asList(array).containsAll(Arrays.asList(unpaired)));
        Assert.assertEquals("sum of all unpaired elements must be same as sum of all elements from original array (as: -1+1==0)",
                Arrays.asList(array).stream().reduce(0, Integer::sum),
                Arrays.asList(unpaired).stream().reduce(0, Integer::sum));
        //TODO: Above is necessary, but not sufficient!
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullArgument() throws Exception {
        Integer[] unpaired = FindUnpaired.findUnpaired(null);
    }

    @Test
    public void shouldReturnEmptyArrayForEmptyArray() throws Exception {
        Integer[] unpaired = FindUnpaired.findUnpaired(new Integer[0]);
        Assert.assertArrayEquals(unpaired, new Integer[0]);
    }
}
