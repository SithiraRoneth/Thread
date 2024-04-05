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
        System.out.println("Count :" + num);
    }
}
public class Main {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.increment();
    }
}
