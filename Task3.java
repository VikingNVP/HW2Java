
// Пример:
// Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
// Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
// Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int resSum = sumIndexOfValues(arr);
        printNewArray(resSum, arr);
    }
    public static int sumIndexOfValues(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 10){
                sum += i;
            }
        }
        return sum;
    }
    /**
     * @apiNote Дан массив целых чисел. 
     * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param resSum Сумма индексов двузначных элементов массива
     * @param arr Данный массив
     */
    public static void printNewArray(int resSum, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = resSum;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
