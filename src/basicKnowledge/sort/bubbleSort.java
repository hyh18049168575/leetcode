package basicKnowledge.sort;

import java.util.Arrays;

public class bubbleSort {
    public static void sort1(int array[]){
        for (int i = 0;i<array.length-1;i++){
            for (int j = 0;j<array.length-1-i;j++){
                int temp = 0;
                if (array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort2(int[] array){
        for (int i = 0;i<array.length-1;i++){
            boolean isSorted = true;
            for (int j = 0; j< array.length-1-i;j++){
                int temp = 0;
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }

    public static void sort3(int[] array){
        int a = 0;
        for (int i = 0;i < array.length-1;i++){
            boolean isSorted = true;

            int sortBorder = array.length-1;
            for (int j = 0;j < sortBorder;j++){
                int temp = 0;
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                    a = j;
                }
            }
            sortBorder = a;
            if (isSorted){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{5,8,6,3,9,2,1,7};
        sort3(array);
        System.out.println(Arrays.toString(array));
    }
}