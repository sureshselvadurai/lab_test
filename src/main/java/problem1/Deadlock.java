package problem1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Deadlock {
     static class Worker implements Runnable {
        private String resource1;
        private String resource2;
        public Worker(String resource1, String resource2) {
            this.resource1 = resource1;
            this.resource2 = resource2;
        }

        @Override
        public void run() {
            synchronized(resource1){
                System.out.println("Thread " + Thread.currentThread().getName() + " has " + resource1);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {}

                synchronized(resource2){
                    System.out.println("Thread " + Thread.currentThread().getName() + " has " + resource2);
                }
            }
        }
    }
  public static void main(String[] args){
      ExecutorService poolManager = Executors.newCachedThreadPool();
      String str1 = "string1";
      String str2 = "string2";
      poolManager.submit(new Worker(str1, str2));
      poolManager.submit(new Worker(str2, str1));

      // FILL IN: fix the deadlock, so that each Runnable is still using two strings,
      // and threads are able to do some work concurrently

  }
}