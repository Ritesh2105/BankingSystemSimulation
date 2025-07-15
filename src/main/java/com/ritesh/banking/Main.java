package  com.ritesh.banking;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String args []){
        Account acc1 = new Account("Ritesh", 10000000);
        Account acc2 = new Account("Amit", 1000);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //Simulating 10 random transactions

        for (int i = 0; i < 10; i++) {
            int amount = 2000;
            executorService.submit(new UserTransaction(acc1, acc2, amount));
            executorService.submit(new UserTransaction(acc2, acc1, amount));
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // wait
        }
        System.out.println("All transactions completed.");
    }
}