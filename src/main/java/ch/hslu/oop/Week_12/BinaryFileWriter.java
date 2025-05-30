package ch.hslu.oop.Week_12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryFileWriter {

    private int value = 1;

    private static void intToBinaryIntoFile(int value){
        try (DataOutputStream in = new DataOutputStream(new FileOutputStream("Demo.txt"))) {
            in.writeInt(value);
        } catch (Exception e) {
            
        }
    }

    private static void readBinaryFromData(){
        try (DataInputStream read = new DataInputStream(new FileInputStream("Demo.txt"))) {
            byte[] content = read.readAllBytes();
            for (byte b : content) {
            }
            // Convert the byte array to an int (assuming the file contains a single int)
            int intContent = 0;
            if (content.length == 4) {
                intContent = ((content[0] & 0xFF) << 24) |
                             ((content[1] & 0xFF) << 16) |
                             ((content[2] & 0xFF) << 8)  |
                             (content[3] & 0xFF);
            }
            System.out.println(intContent);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private static void readBinaryFromData2(){
        try (DataInputStream read = new DataInputStream(new FileInputStream("Demo.txt"))) {
            int content = read.readInt();
            System.out.println(content);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        intToBinaryIntoFile(20);
        readBinaryFromData2();
    }
}
