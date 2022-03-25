package test;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //创建10个线程
        List<myThread> list = new ArrayList<myThread>();
        for(int i=10;i>0;i--){
            myThread thread = new myThread(i);
            thread.start();
        }
    }
    //创建一个内部静态类
    static class myThread extends Thread{
        public int Num;
        static int orderNum = 1;
        //创建一个静态的object类作为共同的互斥锁资源
        static final Object object = new Object();
        public myThread (int num){
            this.Num = num;
        };
        @Override
        public void run(){
            synchronized (object){
                //顺序不匹配则等待，并让出锁资源
                while(Num != orderNum){
                    try {
                        System.out.println(Thread.currentThread().getName()+":wait");
                        //锁是object，用object.wait()，当前线程被阻塞，进入等待队列，同时释放互斥锁object
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //匹配则输出打印，更新orderNum，并通知所有线程。
                System.out.println(Thread.currentThread().getName()+":"+Num);
                orderNum++;
                //通知互斥锁的等待队列
                object.notifyAll();
            }
        }
    }
}




