import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
            PrintWriter outputFile = new PrintWriter("test.txt");
            outputFile.println("Hello from ");
            if(outputFile.checkError()){
                System.err.println("There was an error witht he file!");
            }
            outputFile.close();
    }
}
