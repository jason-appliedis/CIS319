public class FunWithRecursion {
    private static final int numToCount = 10;
    private static final int numForFactorial = 5;
    public static void main(String[] args) throws Exception {
        if(numToCount <= 0){
            System.out.println("You mst use a positive number!");
            System.exit(0);
		}
		
        System.out.println(" CIS319 | Unit 5 Guided Practice 1");

        rocketCountdown(numToCount);

        System.out.println("Factorial:");
        computeFactorial(numForFactorial);
        System.out.println();

    }
    public static void rocketCountdown(int num) {
		System.out.print("Using Iteration: ");
		iterativeCountdown(num);
		System.out.println("Blast Off!");
		
		System.out.print("Using Recursion: ");
		recursiveCountdown(num);
        System.out.println("Blast Off!");
        
	}//end method rocketCountdown
    public static void computeFactorial(int num){
        System.out.print("Using Iteration: ");
		System.out.println(iterativeFactorial(num));
		 
		System.out.print("Using Head Recursion: ");
		System.out.println(headRecursiveFactorial(num));
		 
		System.out.print("Using Tail Recursion: ");
		System.out.println(tailRecursiveFactorial(num));

    }
    private static void iterativeCountdown(int num) {
        //create while loop for better logic
		//displaying each value of the loop iteration on the same line
		//separate values with a blank space
        while(num > 0){
            System.out.print(num);
            System.out.print(" ");
            num--;
        }
    }
    private static void recursiveCountdown(int num) {
        System.out.print(num);
		System.out.print(" ");
		//note that 1 is our base case, the stopping point
		if (num > 1){
			recursiveCountdown(num-1);
        }
    }
    public static long iterativeFactorial(int num) {
		long factorial = 1;
		//finish writing the following for loop
		while(num > 0){
            factorial *= (num);
            num--;
        }
		return factorial;
	}//end method iterativeFactorial
    public static long headRecursiveFactorial(int num) {
		if ((num == 0) || (num == 1))
			return 1;
		else
			return headRecursiveFactorial(num - 1) * num;
		//end if
	}//end method headRecursiveFactorial
    public static long tailRecursiveFactorial(int num) {
		long factorial = 1;
		return tailHelperRecursiveFactorial(num, factorial);
	}//end 
    public static long tailHelperRecursiveFactorial(int currentNum, long factorialSoFar) {
		if (currentNum == 0)
			return factorialSoFar;
		else
			return tailHelperRecursiveFactorial(currentNum - 1, factorialSoFar * currentNum);
		//end if
	}//end method tailHelperRecursiveFactorial


}
