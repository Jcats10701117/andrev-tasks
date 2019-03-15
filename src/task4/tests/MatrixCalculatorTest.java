package task4.tests;

import task4.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class MatrixCalculatorTest {
    @Test public void swapMaxMinLinesInSimpleArray() {
        double[][] array = {
                {1,1,1,1},
                {5,6,7,8},
                {2,2,2,2},
                {2,2,2,2}
        };

        double[][] expected = {
                {5,6,7,8},
                {1,1,1,1},
                {2,2,2,2},
                {2,2,2,2}
        };

        System.out.println(MatrixCalculator.swapMaxMinLines(array));

        assertArrayEquals(expected, array);
    }
    @Test public void swapMaxMinLinesInEmptyArray() {
        double[][] array = {};

        MatrixCalculator.swapMaxMinLines(array);
    }
    @Test public void findMaxLineIndexInSimpleArray() {
        double[][] array = {
                {1,2,3,9},
                {5,6,7,8}
        };

        Integer result = MatrixCalculator.findMaxLineIndex(array);

        assertEquals(0, (int)result);
    }
    @Test public void findMaxLineIndexInEmptyArray() {
        double[][] array = {};
        MatrixCalculator.findMaxLineIndex(array);
    }
    @Test public void findMinLineIndexInSimpleArray() {
        double[][] array = {
                {1,2,3,9},
                {5,6,7,8}
        };

        Integer result = MatrixCalculator.findMinLineIndex(array);

        assertEquals(0, (int)result);
    }
    @Test public void findMinLineInEmptyArray() {
        double[][] array = {};
        assertNull(MatrixCalculator.findMinLineIndex(array));
    }
    @Test public void findMaxInLineInSimpleArray() {
        double[] array = {1,2,3,4};

        Double result = MatrixCalculator.findMaxNumInLine(array);

        assertEquals(4, result, 0.1);
    }
    @Test public void findMaxInLineInEmptyArray() {
        double[] array = {};
        assertNull(MatrixCalculator.findMaxNumInLine(array));
    }
    @Test public void findNullMainDiagonalIndexesInSimpleArray() {
        double[][] array = {
                {0,1,2,3,4},
                {1,0,3,4,5}
        };

        Integer[] exprected = {0,1};

        Integer[] result = MatrixCalculator.getIndexesOfNullDiagonalRows(array);

        for (var n: result)
            System.out.println(n);

        assertArrayEquals(exprected, result);
    }
    @Test public void findNullMainDiagonalIndexesInEmptyArray() {
        double[][] array = {};
        Integer[] expected = {};
        Integer[] actual = MatrixCalculator.getIndexesOfNullDiagonalRows(array);
        assertArrayEquals(expected, actual);
    }
    @Test public void makeNullMainDiagonalPairsInSimpleArray() {
        double[][] array = {
                {0,1,2,3,4},
                {1,0,10,3,4}
        };

        RowElementPair[] expected = {
                new RowElementPair(0, 4),
                new RowElementPair(1, 10)
        };

        RowElementPair[] actual = MatrixCalculator.getNullMainDiagonalPairs(array);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].rowNumber, actual[i].rowNumber);
            assertEquals(expected[i].value, actual[i].value, 0.01);
        }
    }
}