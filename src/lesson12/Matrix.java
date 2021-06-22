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
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Такие матрицы нельзя складывать, неравное кол-во строк");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Такие матрицы нельзя складывать, неравное кол-во колонок");
            return null;
        }
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
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Такие матрицы нельзя вычитать, неравное кол-во строк");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Такие матрицы нельзя вычитать, неравное кол-во колонок");
            return null;
        }
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
        if (this.getRows() != otherMatrix.getColumns()) {
            System.out.println("Такие матрицы нельзя перемножать, кол-во строк одной не равно кол-ву колонок другой");
            return null;
        }
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < matrix.length; k++) {
                    result.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(k, j));
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.setValueAt(i, j, (this.getValueAt(i, j) * value));
            }
        }
        return this;
    }

    @Override
    public IMatrix transpose() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return this;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                this.setValueAt(i, j, value);
            }
        }
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; i++) {
                if (matrix[i][j] != 1 && i == j) {     //НЕ ДОДЕЛАНО, не могу догнать:(
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (matrix.length == matrix[0].length) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
