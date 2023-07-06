package FileCreate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Text {
    public static void main(String[] args) throws IOException {
        File file =new File("textFile.txt");

        if(!file.exists()) file.createNewFile();

        BufferedWriter buffer = new BufferedWriter(new FileWriter(file));

        buffer.write("meraj");
        buffer.close();

    }
}
//append method