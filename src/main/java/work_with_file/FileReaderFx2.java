package work_with_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFx2 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/main/resources/file.txt"))
        {
            int charaster;
            while ((charaster=fileReader.read())!=-1){
                System.out.print((char) charaster);
            }
            System.out.println();
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
