//Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел через пробел: ");
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            int[] a = newArray(n);
            int result = sumValues(a);
            System.out.println("sum = " + result);
        }
    }

    public static int[] newArray(String n) {
        String s[] = n.split(" ");
        int newArr[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            newArr[i] = Integer.parseInt(s[i]);
        }
        return newArr;
    }
/**
 * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
 * @param a Массив считанной строки после преобразования
 * @return Сумма простых чисел 
 */
    public static int sumValues(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isPrime = true;
            if (a[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= a[i] / 2; j++) {
                    if (a[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                if (a[i] != 0) {
                    sum += a[i];
                }
            }
        }
        return sum;
    }
}
