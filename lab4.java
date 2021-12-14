import java.util.InputMismatchException;
import java.util.Scanner;

public class lab4 {
    public static void main(String args[]) {
        int n = 0;
        int inp = 0;
        float sum = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество элементов массива");
            n = scanner.nextInt();
            System.out.println("Введите элементы массива по порядку");
            float[] array = new float[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextFloat();
            }
            System.out.println("Введите число K. Элемент под этим номером заменится на среднее арифметическое первых K исходных элементов массива. Примечание: нумерация начинается с нуля.");
            inp = scanner.nextInt();
            scanner.close();
            System.out.print("Оригинальное состояние массива: ");
            for (float element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
            for (int g = 0; g < inp; g++) {
                sum = sum + array[g];
            }
            sum = sum / (inp);
            if ((inp <= array.length) & (inp > 0)) {
                array[inp] = sum;
                System.out.print("Итоговое состояние массива: ");
                for (float element : array) {
                    System.out.print(element + " ");
                }
            }
        }
            catch(InputMismatchException e){
                System.out.println("Ошибка ввода данных, попробуйте ещё раз предварительно перезапустив программу.");
            }

    }
}