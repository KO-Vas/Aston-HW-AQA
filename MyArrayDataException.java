public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super("Ошибка преобразования в ячейке [" + row + "][" + col + "]");
    }
}