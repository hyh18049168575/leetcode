package basicKnowledge;


import java.util.Arrays;
import java.util.PriorityQueue;

public class priorityQueue {
    private int[] array;
    private int size;
    public void PriorityQueue(){
        //队列初始长度为32
        array = new int[32];
    }

    /**
     * 入队
     * @param key 入队元素
     */
    public void enQueue(int key){
        if (size >= array.length){
            resize();
        }
        array[size++] = key;
        upAdjust();
    }

    /**
     *出队
     * @throws Exception
     */
    public int deQueue() throws Exception{
        if (size <= 0){
            throw new Exception("the Queue is empty!");
        }
        //获得堆顶元素
        int head = array[0];
        //让最后一个元素移动到堆顶
        array[0] = array[--size];
        downAdjust();
        return head;
    }

    /**
     * 上浮
     */
    private void upAdjust(){
        int childIndex = size - 1;
        int parentIndex = childIndex/2;
        //temp保存插入的叶子节点值，用于最后的赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp > array[parentIndex]){
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = parentIndex/2;
        }
        array[childIndex] = temp;
    }

    /**
     * 下沉
     */
    private void downAdjust(){
        //temp保存父结点的值，用于最后的赋值
        int parentIndex = 0;
        int temp = array[parentIndex];
        int childIndex = 1;
        while (childIndex < size){
            //如果有右孩子，且右孩子大于左孩子的值，则定位到右孩子
            if (childIndex +1 <size && array[childIndex] > array[childIndex]){
                childIndex++;
            }
            //如果父节点大于任何一个孩子的值，直接跳出
            if (temp >= array[childIndex])break;
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2*childIndex +1;
        }
        array[parentIndex] = temp;
    }


    private void resize(){
        //队列扩容
        int newSize = this.size * 2;
        this.array = Arrays.copyOf(this.array, newSize);
    }

    public static void main(String[] args) throws Exception {
        PriorityQueue priorityQueue = new PriorityQueue();
    }
}
