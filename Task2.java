import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность целых чисел через пробел: ");
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            int[] a = newArray(n);
            System.out.println("result = " + myMethod(a));
        }
    }
/**
 * @apiNote Дана последовательность из N целых чисел. 
 * Верно ли, что последовательность является возрастающей.
 * @param n Строка чисел, считанная с терминала
 * @param a Строка, преобразованная в массив
 * @return Результат True или False
 */
    public static int[] newArray(String n) {
        String s[] = n.split(" ");
        int newArr[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            newArr[i] = Integer.parseInt(s[i]);
        }
        return newArr;
    }
    public static boolean myMethod(int[] a) {
        boolean flag = true;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] < a[i + 1]){
                flag = true;
            }else flag = false;
        }
        return flag;
    }   
}
