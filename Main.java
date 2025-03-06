import java.util.Arrays;

public class Main {
    // Task 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task 2
    public static void checkSumSign() {
        int a = 15;
        int b = -10;
        int sum = a + b;
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    // Task 3
    public static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task 4
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    // Task 5
    public static boolean checkSumLimits(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    // Task 6
    public static void checkNumberValue(int number) {
        System.out.println(number >= 0 ? "Положительное" : "Отрицательное");
    }

    // Task 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // Task 8
    public static void printStringSomeTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // Task 9
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Task 10
    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Task 11
    private static int[] createHundredArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Task 12
    private static void processArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
    }

    // Task 13
    private static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size-1-i] = 1;
        }
        return matrix;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumLimits(19, 1));
        checkNumberValue(0);
        System.out.println(isNegative(-1));
        printStringSomeTimes("Aston", 6);
        System.out.println(isLeapYear(2000));

        // Task 10
        int[] task10Array = {1,1,0,0,1,0,1,1,0,0};
        printArray(task10Array);

        // Task 11
        int[] hundredArray = createHundredArray();
        System.out.println("\nСотка: " + Arrays.toString(hundredArray));

        // Task 12
        int[] task12Array = {1,5,3,2,11,4,5,2,4,8,9,1};
        processArray(task12Array);
        System.out.println("Task12 result: " + Arrays.toString(task12Array));

        // Task 13
        int[][] matrix = createDiagonalMatrix(5);
        System.out.println("\nДиагональная матрица:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}