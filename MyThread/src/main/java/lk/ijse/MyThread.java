/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :09:36
 * Project Name :Thread
 * */
package lk.ijse;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Start");
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
