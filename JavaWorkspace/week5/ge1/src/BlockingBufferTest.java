// Fig 23.15: BlockingBufferTest.java
// Two threads manipulating a blocking buffer that properly 
// implements the producer/consumer relationship.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest
{
   public static void main(String[] args) throws InterruptedException
   {
      // create new thread pool with two threads
      ExecutorService executorService = Executors.newCachedThreadPool();

      // create BlockingBuffer to store ints
      Buffer sharedLocation = new BlockingBuffer(5);

      //set 1
      executorService.execute(new Producer(sharedLocation , "P1", 2, 10, 16));
      executorService.execute(new Consumer(sharedLocation, "C1", 3, 1,9));
      
      //set 2
      executorService.execute(new Producer(sharedLocation , "P2", 3, 25, 29));
      executorService.execute(new Consumer(sharedLocation, "C2", 2, 1, 13));

      //set 3 Forces the process to time out
      executorService.execute(new Producer(sharedLocation , "P3", 1, 30, 39));

      executorService.awaitTermination(10, TimeUnit.SECONDS); 
      executorService.shutdown();

      //end program after timeout
      System.exit(0);
   } 
} // end class BlockingBufferTest



/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/