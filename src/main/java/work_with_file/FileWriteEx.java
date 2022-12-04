package work_with_file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) throws IOException {
        String rubai ="Когда, стройна и светлоока,\n" +
                "Передо мной стоит она…\n" +
                "Я мыслю: «В день Ильи-пророка\n" +
                "Она была разведена!";
        String privet ="Privet";
        FileWriter fileWriter = null;

        //try(FileWriter fileWriter = new FileWriter("src/main/resources/file.txt")) - что бы не писать блок finally

        try {
            // если добавить вторым параметром в FileWriter то будет добавлять в ранее добавленное
            fileWriter = new FileWriter("src/main/resources/file.txt");
            //два варианта записи или по симсольно или сразу черезе метод write
            //1 вариант
            for (int i = 0; i < rubai.length(); i++) {
                fileWriter.write(rubai.charAt(i));
            }
            //2 вариант
            fileWriter.write(rubai+"\n"+privet);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
        }
    }
}
