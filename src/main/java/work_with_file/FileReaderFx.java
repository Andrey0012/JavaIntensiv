package work_with_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFx {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/main/resources/file.txt");
            int charaster;
            while ((charaster=fileReader.read())!=-1){
                System.out.print((char) charaster);
            }
            System.out.println();
            System.out.println("Dane");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }


    }
}
