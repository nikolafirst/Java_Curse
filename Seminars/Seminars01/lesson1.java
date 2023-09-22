package Seminars.Seminars01;

public class lesson1 {
    public static void main(String[] args) {
        // Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1] вывести максимально
        // количество подряд идущих 1

        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count ++;
                if (count > max) {
                    max = count;
                }

            }
            else{
                count = 0;
            }
        }
        if(count > max){
            max = count;
        }
        System.out.println(max);
    }
}
