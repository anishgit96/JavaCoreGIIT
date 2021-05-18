package JavaThreads;

class Tablee{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class My1Thread extends Thread{
    Table t;
    My1Thread(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread extends Thread{
    Table t;
    MyThread(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class Syncronization{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
