package lk.ijse;

class Q{
    int num;
    public void put(int num){
        System.out.println("Put" + num);
        this.num = num;
    }
    public int get(){
        System.out.println("Get" + num);
        return num;
    }
}
class Producer implements Runnable{
    Q q;
    public Producer(Q q){
        this.q = q;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
        this.q = q;
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }
    @Override
    public void run() {
       while (true){
           q.get();
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){
               throw new RuntimeException(e);
           }
       }
    }
}
public class InterThread {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}