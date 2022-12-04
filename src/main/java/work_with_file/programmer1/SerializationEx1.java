package work_with_file.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Andrey");
        employees.add("Zayr");
        employees.add("Aleksei");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/emp.bin"))){
            outputStream.writeObject(employees);
            System.out.println("Dane");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
