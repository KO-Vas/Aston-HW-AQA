public class Main {

    public static void main(String[] args) {
        // Пример корректного массива
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива с ошибкой данных
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "X", "8"}, // Ошибка здесь
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива неверного размера
        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        // Обработка исключений
        try {
            System.out.println("Сумма корректного массива: " + sumArray(correctArray));
            System.out.println("Сумма массива с ошибкой: " + sumArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Генерация ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Выход за границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4. Получено строк: " + array.length);
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Каждая строка должна содержать 4 элемента");
            }
        }

        // Суммирование элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}