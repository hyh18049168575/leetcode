package basicKnowledge.sort;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class quickSort {
    public static void quickSort(int[] arr, int startIndex, int endIndex){
        //递归结束条件：startIndex大于或等于endIndex时。
        if (startIndex >= endIndex){
            return;
        }
        //得到基准元素的位置
        int pivotIndex = partition(arr, startIndex, endIndex);
        //根据基准元素，分为两部分进行递归排序
        quickSort(arr, startIndex, pivotIndex-1);
        quickSort(arr, pivotIndex+1, endIndex);
    }

    /**
     * 分治
     * @param arr   待交换数组
     * @param startIndex    起始下标
     * @param endIndex      结束下标
     */
    private static int partition(int[] arr, int startIndex, int endIndex){
        //取第一个位置（也可以随机选位置）的元素作为基准元素
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left != right){
            //控制right指针比较并左移
            while ( left < right && arr[right] > pivot){
                right--;
            }
            while (left<right && arr[left] <= pivot){
                left++;
            }
            if (left < right){
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }
        }

        //pivot 和指针重合点交换
        arr[startIndex] = arr[left];
        arr[left] = pivot;

        return right;
    }

    public static void quickSort1(int[] arr, int startIndex, int endIndex){
        //结束递归条件 ：startIndex大于或者等于endIndex
        if (startIndex >= endIndex){
            return;
        }
        //得到基准元素
        int pivotIndex = partition1(arr,startIndex,endIndex);
        quickSort1(arr,startIndex,pivotIndex-1);
        quickSort1(arr,pivotIndex+1,endIndex);

    }

    /**
     * @param arr  待交换数组
     * @param startIndex 起始下标
     * @param endIndex 结束下标
     */
    private static int partition1(int[] arr, int startIndex,int endIndex){
        //第一个位置为基准元素
        int pivot = arr[startIndex];
        int mark = startIndex;

        for (int i=startIndex+1;i <= endIndex;i++){
            if (arr[i] < pivot){
                mark++;
                int p = arr[mark];
                arr[mark] = arr[i];
                arr[i] = p;
            }
        }
        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }

    public static void quickSort2(int[] arr, int startIndex, int endIndex){
        //用一个集合栈来代替递归的函数栈
        Stack<Map<String, Integer>> quickSortStack = new Stack<Map<String,Integer>>();
        //整个数列的起止下标，以哈希的形式入栈
        Map rootParam = new HashMap();
        rootParam.put("startIndex", startIndex);
        rootParam.put("endIndex",endIndex);
        quickSortStack.push(rootParam);
        //循环结束条件：栈为空时
        while (!quickSortStack.isEmpty()){
            //栈顶元素出栈，得到起止上下标
            Map<String, Integer> param = quickSortStack.pop();
            //找到基准元素为止
            int pivotIndex = partition2(arr, param.get("startIndex"), param.get("endIndex"));
            //根据基准元素分成两部分，把每一部分的起止下标入栈
            if (param.get("startIndex") < pivotIndex-1){
                Map<String,Integer> leftParam = new HashMap<String,Integer>();
                leftParam.put("startIndex",param.get("startIndex"));
                leftParam.put("endIndex",pivotIndex-1);
                quickSortStack.push(leftParam);
            }
            if (pivotIndex + 1 < param.get("endIndex")){
                Map<String,Integer > rightParam = new HashMap<String,Integer>();
                rightParam.put("startIndex",pivotIndex+1);
                rightParam.put("endIndex", param.get("endIndex"));
                quickSortStack.push(rightParam);
            }
        }
    }

    /**
     * @param   arr
     * * @param startIndex
     ** @param endIndex
     */
    private static int partition2(int[]arr, int startIndex, int endIndex){
        //取第一个位置的元素为基准元素
        int pivot = arr[startIndex];
        int mark = startIndex;
        for (int i = startIndex+1;i <= endIndex;i++){
            if (arr[i]<pivot){
                mark++;
                int p = arr[mark];
                arr[mark] = arr[i];
                arr[i] = p;
            }
        }
        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }


    public static void main(String[] args){
        int[] arr = new int[] {4,4,6,5,3,2,8,1};
        quickSort2(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
