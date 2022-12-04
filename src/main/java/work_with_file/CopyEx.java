package work_with_file;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/file.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/file1.txt"));){
            int charaster;

            //1 вариант
//            while ((charaster=bufferedReader.read())!=-1) {
//                bufferedWriter.write(charaster);
//            }

            //2 вариант
            String str;
            while ((str=bufferedReader.readLine())!=null) {
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
