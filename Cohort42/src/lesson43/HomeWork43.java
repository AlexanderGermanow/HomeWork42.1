package lesson43;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #43
 *
 * @author Alexander Germanow
 * @version 29-Apr-24
 */
public class HomeWork43 {
    public static void main(String[] args) {
        // test1: normal
        // test2: bad size
        // test3: bad data
    }

    static int calculateArray(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sumMatrix = 0;
        // check matrix size
        if (matrix.length > 4) {
            throw new MyArraySizeException("matrix.length > 4");
        }
        for (String[] rowMatrix : matrix) {
            if ( rowMatrix.length > 4) {
                throw new MyArraySizeException("matrix.row > 4");
            }
        }
        // calculate matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                String element = matrix[row][column];
                // convert String -> int
                // increment sumMatrix
                try {
                    sumMatrix += Integer.valueOf(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("row: " + row + ", column:" + column + ", bad element:" + element);
                }
            }
        }
        return sumMatrix;
    }
}
