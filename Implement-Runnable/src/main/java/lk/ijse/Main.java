/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :10:30
 * Project Name :Thread
 * */
package lk.ijse;
class One implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("One");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Two implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Two");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();

    }
}
