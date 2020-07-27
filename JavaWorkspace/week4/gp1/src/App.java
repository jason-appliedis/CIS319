import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
            PrintWriter outputFile = new PrintWriter("Jason.txt");
            outputFile.println("Hello from Jason");
            if(outputFile.checkError()){
                System.err.println("There was an error witht he file!");
            }
            outputFile.close();
    }
}
