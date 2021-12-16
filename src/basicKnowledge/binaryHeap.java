package basicKnowledge;

import java.util.Arrays;

public class binaryHeap {

    /**
     * 上浮
     * @param array
     */
    public static void upAdjust(int[] array){
        int childIndex = array.length-1;
        int parentIndex = (childIndex-1)/2;
        //temp保存插入的叶子节点值，用于最后的赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]){
            //无须真正交换，单向赋值即可
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex-1)/2;
        }
        array[childIndex] = temp;
    }

    /**
     *
     * @param array 要调整的堆
     * @param parentIndex 要下沉的父节点
     * @param length 堆的有效大小
     */
    public static void downAdjust(int[] array, int parentIndex, int length){
    //temp保存父节点值，用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2*parentIndex + 1;
        while (childIndex < length){
            //如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex +1 < length && array[childIndex +1] < array[childIndex]){
                childIndex++;
            }
            if (temp <= array[childIndex])break;
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2*childIndex +1;
        }
        array[parentIndex] = temp;
    }

    public static void buildHeap(int[] array){
        //从最后一个非叶子节点开始，依次做下沉调整
        for (int i = (array.length-2)/2;i>=0;i--){
            downAdjust(array,i,array.length);
        }
    }


    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,6,5,7,8,9,10,0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{7,1,3,10,5,2,8,9,6};
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }
}


