package FileCreate.Write;

import java.io.*;
import java.util.concurrent.CountDownLatch;

public class FileWrite {
    public static void main(String[] args)  {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("WriteFile.txt"));
            file.write("write something about me ");
            file.close();

            BufferedReader file1 =new BufferedReader(new FileReader("textFile.txt"));
            System.out.println(file1.readLine());
            file1.close();


        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
