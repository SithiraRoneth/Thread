/* Created By Sithira Roneth
 * Date :4/5/24
 * Time :11:33
 * Project Name :Thread
 * */
package lk.ijse;

public class Main {
    public static void main(String[] args) throws InterruptedException{
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
        one.setName("Thread 1");
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        // print true and Thread-1
        System.out.println("[" + one.isAlive()+"]");
        System.out.println("[" + one.getName()+"]");

        two.start();
        two.setName("Thread 2");

        // print Thread-2
        System.out.println("[" + two.getName() + "]");

        one.join();
        two.join();

        // print False
        System.out.println("[" + one.isAlive()+"]");
        System.out.println("BYE");

    }
}
