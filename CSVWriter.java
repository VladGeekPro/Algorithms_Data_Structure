import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.CSVWriter;


public class CSVWriter {
   
    public static void writeDataLineByLine(String filePath)
    {
       File file = new File(filePath);
        try {
           
            FileWriter outputfile = new FileWriter(file);
      
           
            CSVWriter writer = new CSVWriter(outputfile);
      
          
            String[] header = {"BTN", "CNY", "08.08.2023", "6,00", "112" };
            writer.writeNext(header);
      
        
            String[] data1 = {"BAM", "NZD", "15.09.2023", "2,89", "897" };
            writer.writeNext(data1);
            String[] data2 =  {"BDT", "TJS", "05.01.2022", "19,51", "972" };
            writer.writeNext(data2);      
         
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

