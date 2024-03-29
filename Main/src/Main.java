import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

class HelloWorld {
    private int n;
    public int flag=0;
    Object obj=new Object();
    public HelloWorld(int n){
        this.n = n;
    }
    public void hello() throws InterruptedException{
        for (int i = 0; i < n; i++) {
            synchronized (obj){
                if(flag==1) {
                    obj.wait();
                }
                System.out.print("Hello");
                flag=1;
                obj.notify();

            }
        }
    }

    public void world() throws InterruptedException{
        for (int i = 0; i < n; i++) {
            synchronized (obj){
                if(flag==0) {
                    obj.wait();
                    }
                System.out.println("World!");
                flag=0;
                obj.notify();
            }
        }
    }
    }

class PrintWorld implements Runnable{
    HelloWorld helloWorld;
    public PrintWorld(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    @Override
    public void run(){
        try {
            helloWorld.world();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintHello implements Runnable {
    HelloWorld helloWorld;
    public PrintHello(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    @Override
    public void run() {
        try {
            helloWorld.hello();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HelloWorld helloWorld = new HelloWorld(n);
        PrintHello printHello = new PrintHello(helloWorld);
        PrintWorld printWorld = new PrintWorld(helloWorld);
        new Thread(printHello).start();
        new Thread(printWorld).start();
    }
}

