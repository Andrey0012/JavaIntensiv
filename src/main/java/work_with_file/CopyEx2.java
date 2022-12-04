package work_with_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\20325071\\Desktop\\SOLID.png");
             FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/SOLID.png")){
          int i;
            while ((i=fileInputStream.read())!=-1) {
                fileOutputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
