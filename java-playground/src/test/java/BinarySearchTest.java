package src.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.SearchingAlgorithms;

public class BinarySearchTest {
    @Test 
    public void testFindMin1() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = SearchingAlgorithms.binarySearch(array, 3);
        assertEquals(2, result);
    }
    @Test 
    public void testFindMin2() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = SearchingAlgorithms.binarySearch(array, 7);
        assertEquals(-1, result);
    }
}
