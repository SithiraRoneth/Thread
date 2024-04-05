/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :11:12
 * Project Name :Thread
 * */
package lk.ijse;

public class Main {
    public static void main(String[] args) {

        Thread one = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("One");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Two");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        });

        one.start();
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        two.start();

        System.out.println("BYE");
    }
}
