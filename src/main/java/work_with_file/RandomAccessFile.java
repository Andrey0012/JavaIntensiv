package work_with_file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile("src/main/resources/file.txt", "rw")) {
            int read = randomAccessFile.read();
            System.out.println((char) read);
            String s = randomAccessFile.readLine();
            System.out.println(s);

            randomAccessFile.seek(120);
            String read1 = randomAccessFile.readLine();
            System.out.println(read1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
