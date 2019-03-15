package task4;

public class MatrixCalculator {
    public static boolean swapMaxMinLines(double[][] array) {
        if (array == null) return false;
        if (array.length == 0) return false;
        if (array[0].length == 0) return false;
        if (array.length != array[0].length) return false;

        Integer minLineIndex = findMinLineIndex(array);
        Integer maxLineIndex = findMaxLineIndex(array);

        if (minLineIndex == null || maxLineIndex == null) {
            return false;
        }

        double[] minLine = array[minLineIndex];
        double[] maxLine = array[maxLineIndex];

        array[minLineIndex] = maxLine;
        array[maxLineIndex] = minLine;

        return true;
    }

    public static RowElementPair[] getNullMainDiagonalPairs(double[][] array) {
        Integer[] indexesArray = getIndexesOfNullDiagonalRows(array);
        RowElementPair[] rowElementPairs = new RowElementPair[indexesArray.length];
        for (int i = 0; i < indexesArray.length; i++){
            rowElementPairs[i] = new RowElementPair(indexesArray[i], findMaxNumInLine(array[indexesArray[i]]));
        }
        return rowElementPairs;
    }

    public static Integer findMaxLineIndex(double[][] array) {
        if (array.length == 0) return null;
        if (array[0].length == 0) return null;

        Integer index = null;
        double maxValue = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > maxValue){
                    maxValue = array[i][j];
                    index = i;
                }
            }
        }
        return index;
    }

    public static Integer findMinLineIndex(double[][] array) {
        if (array.length == 0) return null;
        if (array[0].length == 0) return null;

        int index = 0;
        double maxValue = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < maxValue){
                    maxValue = array[i][j];
                    index = i;
                }
            }
        }
        return index;
    }

    public static Double findMaxNumInLine(double[] array) {
        if (array.length == 0) return null;

        double max = array[0];

        for (double n: array) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static Integer[] getIndexesOfNullDiagonalRows(double[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == 0) { counter++; }
        }

        Integer[] indexArray = new Integer[counter];

        for (int i = 0; i < array.length; i++) {
                if (array[i][i] == 0) {
                    for (int g = 0; g < indexArray.length; g++) {
                        if (indexArray[g] == null){
                            indexArray[g] = i;
                            break;
                        }
                    }
                }
            }
        return indexArray;
    }
}
