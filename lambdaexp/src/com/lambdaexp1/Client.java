package com.lambdaexp1;

public class Client {
public static void main(String[] args) {
       
         createThreadusingLambda1();
         
 }
   private static void createThreadusingLambda1(){
Runnable r=()-> System.out.println("Hello World@@@");
              Thread thread1 = new Thread(r);
              thread1.start();
   }

       
private static void createThreadusingLambda() {
         MyThread myThread=new MyThread();
       Thread thread1 = new Thread(myThread);
       thread1.start();
}
       
}
