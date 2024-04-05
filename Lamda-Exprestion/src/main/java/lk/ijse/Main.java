/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :10:42
 * Project Name :Thread
 * */
package lk.ijse;

public class Main {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("One");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Two");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        };

        Thread one = new Thread(obj1);
        Thread two = new Thread(obj2);

        one.start();
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        two.start();
    }
}
