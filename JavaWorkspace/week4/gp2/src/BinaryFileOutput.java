import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileOutput {
    private static final String myName = "";
    public static void writeToFile() throws IOException
	{
		FileOutputStream outStream = new FileOutputStream(myName + ".dat");
		DataOutputStream outputFile = new DataOutputStream(outStream);
		System.out.println("Starting to write to file");
		outputFile.writeInt(5);
		outputFile.writeDouble(9.95);
		System.out.println("Finished writing to file\n");
		outputFile.close();
	}//end method writeToFile
    public static void readFromFile() throws IOException
	{
		FileInputStream inStream = new FileInputStream( myName + ".dat");
		DataInputStream inputFile = new DataInputStream(inStream);
		int fileInt = 0;
		double fileDbl = 0.0;
		System.out.println("Starting to read file");
		fileInt = inputFile.readInt();
		System.out.print(fileInt + " ");
		fileDbl = inputFile.readDouble();
		System.out.println(fileDbl);
		inputFile.close();
		System.out.println("Finished reading from file");
	}//end method readFromFile

    
}