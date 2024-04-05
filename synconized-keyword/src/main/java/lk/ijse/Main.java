/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :12:06
 * Project Name :Thread
 * */
package lk.ijse;

class Calculation{
    int num;
    public synchronized void increment(){
        num++;
    }
}
public class Main{
    public static void main(String[] args) throws InterruptedException{
                Calculation c = new Calculation();

                Thread t1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i=1;i<=10000;i++){
                            c.increment();
                        }
                    }
                });

                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i=1;i<=10000;i++){
                            c.increment();
                        }
                    }
                });

                t1.start();
                t2.start();
                t1.join();
                t2.join();

                System.out.println("Count : "+c.num);

            }
}