package ch.hslu.oop.Week_12;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileExistsTester {

    public static Logger log = LoggerFactory.getLogger(FileExistsTester.class);

    public static boolean fileExists(){
        File f = new File("C:\\oop_exercises_2.0\\src\\main\\java\\ch\\hslu\\oop\\Week_12\\netatmo-export-202301-202304.csv");
        return f.exists();
    }


    public static void main(String[] args){
        if (fileExists() == true) {
            System.out.println("File exists!");
            readCSVData();
        }else{
            System.out.println("File does not exist!");
        }
    }

    private static void readCSVData(){
        try (DataInputStream read = new DataInputStream(new FileInputStream("C:\\oop_exercises_2.0\\src\\main\\java\\ch\\hslu\\oop\\Week_12\\netatmo-export-202301-202304.csv"))) {
            String content;
            while (true) {
                content = read.readLine();
                if (content == null) {
                    log.info("End of FIle!");
                    break;
                }else{
                log.info(content.split(";")[2]);
                }
            }
        }catch (Exception e){
            log.error("Error during file read!");
        }
    }
}
