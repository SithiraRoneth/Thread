/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :09:39
 * Project Name :Thread
 * */
package lk.ijse;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Start");
    }
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();
    }

}
