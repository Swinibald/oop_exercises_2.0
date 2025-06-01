package ch.hslu.oop.Week_12;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemperaturFileReader {

    public TemperaturVerlauf tempV = new TemperaturVerlauf();

    public static Logger log = LoggerFactory.getLogger(TemperaturFileReader.class);
    public ArrayList<Double> tempWert = new ArrayList<>();
    private ArrayList<LocalDateTime> dateTimes = new ArrayList<>();

    public static boolean fileExists(){
        File f = new File("C:\\oop_exercises_2.0\\src\\main\\java\\ch\\hslu\\oop\\Week_12\\netatmo-export-202301-202304.csv");
        return f.exists();
    }

    private void readCSVTemp(){
        try (DataInputStream read = new DataInputStream(new FileInputStream("C:\\oop_exercises_2.0\\src\\main\\java\\ch\\hslu\\oop\\Week_12\\netatmo-export-202301-202304.csv"))) {
            String content;
            while (true) {
                content = read.readLine();
                if (content == null) {
                    log.info("End of FIle!");
                    break;
                }else{
                tempWert.add(Double.valueOf(content.split(";")[2]));
                }
            }
        }catch (Exception e){
            log.error("Error during file read!");
        }
    }

    private void readCSVdateTime(){
        try (DataInputStream read = new DataInputStream(new FileInputStream("C:\\oop_exercises_2.0\\src\\main\\java\\ch\\hslu\\oop\\Week_12\\netatmo-export-202301-202304.csv"))){
            String timestampAsString = null;
            String content = null;
            while (true) {
                content = read.readLine();
                if (content == null) {
                    log.info("End of FIle!");
                    break;
                }else{
                timestampAsString = content.split(";")[1];
                LocalDateTime timestamp =  LocalDateTime.parse(timestampAsString, DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\"")); 
                dateTimes.add(timestamp);
                }
            }
            
        }catch (Exception e){
            log.error("Error during file read!", e);
        }
    }

    public void addTempToVerlauf(){
        readCSVTemp();
        readCSVdateTime();
        int i = 0;
        while (true) {
            if (i >= tempWert.size()) {
                break;
            }else{
                Temperature temp = new Temperature(tempWert.get(i), dateTimes.get(i));
                tempV.add(temp);
                i++;  
            }
        }
    }
}
