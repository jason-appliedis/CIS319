// Fig. 23.10: Producer.java
// Producer with a run method that inserts the values 1 to 10 in buffer.
/**
 * name, a string; sleepTime, an integer; startProducing, an integer; and stopProducing, an integer
 */
import java.security.SecureRandom;

public class Producer implements Runnable{
   private static final SecureRandom generator = new SecureRandom();
   private final Buffer sharedLocation; // reference to shared object
   //members to keep track of the producer
   private String name;
   private Integer sleepTime;
   private Integer startProducing;
   private Integer stopProducing;

   // constructor
   public Producer(Buffer sharedLocation, String name, Integer sleepTime, Integer startProducing, Integer stopProducing)
   {
      this.sharedLocation = sharedLocation;
      this.name = name;
      this.sleepTime = sleepTime;
      this.startProducing = startProducing;
      this.stopProducing = stopProducing;
   } 

   // store values from 1 to 10 in sharedLocation
   public void run()                             
   {
      int sum = 0;

      for (int i = this.startProducing; i <= stopProducing; this.startProducing++)
      {
         try // sleep 0 to 3 seconds, then place value in Buffer
         {
            Thread.sleep(generator.nextInt(this.sleepTime)); // random sleep
            sharedLocation.blockingPut(i); // set value in buffer
            sum += i; // increment sum of values
         } 
         catch (InterruptedException exception) 
         {
            Thread.currentThread().interrupt(); 
         } 
      } 

      System.out.printf("%n%s %s %n%s %s", this.name,"done Producing.","Terminating Producer", this.name);
   } 
} // end class Producer



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