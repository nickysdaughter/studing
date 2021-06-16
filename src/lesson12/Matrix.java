package lesson12;

public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix() {
    }

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= matrix.length) {
            System.out.println("Слишком большой индекс строки");
            return -1;
        }
        if (colIndex >= matrix[0].length) {
            System.out.println("Слишком большой индекс колонки");
            return -1;
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= matrix.length) {
            System.out.println("Слишком большой индекс строки");
            return;
        }
        if (colIndex >= matrix[0].length) {
            System.out.println("Слишком большой индекс колонки");
            return;
        }
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); i++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                for (int k = 0; k < result.getColumns(); k++){
                    //result += this.getValueAt(i, k) * otherMatrix.getValueAt(k, j); - problem!!!!
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {

        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; i++) {
                if (matrix[i][j] != 0.0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
