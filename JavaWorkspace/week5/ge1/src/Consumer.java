
    // Fig. 23.11: Consumer.java
// Consumer with a run method that loops, reading 10 values from buffer.
import java.security.SecureRandom;


public class Consumer implements Runnable{
   private static final SecureRandom generator = new SecureRandom();
   private final Buffer sharedLocation; // reference to shared object
  //members to keep track of the producer
  private String name;
  private Integer sleepTime;
  private Integer startConsuming;
  private Integer stopConsuming;

   // constructor
   public Consumer(Buffer sharedLocation, String name, Integer sleepTime, Integer startConsuming, Integer stopConsuming)
   {
      this.sharedLocation = sharedLocation;
      this.name = name;
      this.sleepTime = sleepTime;
      this.startConsuming = startConsuming;
      this.stopConsuming = stopConsuming;
   }

   // read sharedLocation's value 10 times and sum the values
   public void run() {
      int sum = 0;
      for (int count = this.startConsuming; count <= this.stopConsuming; count++) 
      {
         // sleep 0 to 3 seconds, read value from buffer and add to sum
         try {
            Thread.sleep(generator.nextInt( this.sleepTime));
            sum += sharedLocation.blockingGet();
         } 
         catch (InterruptedException exception) {
            Thread.currentThread().interrupt(); 
         } 
      } 

      System.out.printf("%n%s %s %d%n%s %s%n", 
         this.name, "read values totaling", sum, "Terminating", this.name);
   } 
} // end class Consumer


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
    