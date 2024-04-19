/* Created By Sithira Roneth
 * Date :4/19/24
 * Time :10:55
 * Project Name :Thread
 * */
package lk.ijse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new MyRunnable("worker Thread :" + i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (executorService.isTerminated()){}
        System.out.println("Success");
    }

}
