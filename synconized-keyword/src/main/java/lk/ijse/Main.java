/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :12:06
 * Project Name :Thread
 * */
package lk.ijse;

class Calculation{
    int num;
    public void increment(){
        num++;
    }
}
public class Main{
    public static void main(String[] args) throws InterruptedException{
        Calculation c = new Calculation();

        Thread calc = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                c.increment();
            }
        });
        calc.start();
        calc.join();
        System.out.println("Count : " + c.num);
    }
}
