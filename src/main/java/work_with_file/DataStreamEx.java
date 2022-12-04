package work_with_file;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/main/resources/Ser.bin"));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/Ser.bin"))
        ){
          dataOutputStream.writeBoolean(true);
          dataOutputStream.writeByte(5);
          dataOutputStream.writeInt(500);
          dataOutputStream.writeLong(800L);
          dataOutputStream.writeDouble(5.5);
          dataOutputStream.writeFloat(8.8f);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readFloat());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
