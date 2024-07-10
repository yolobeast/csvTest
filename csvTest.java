import java.awt.FileDialog;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder; 

public class csvTest {
    public static void main(String[] args) throws FileNotFoundException {


        HashSet <String> fileOne = new HashSet<String>();
        HashSet <String> fileTwo = new HashSet<String>();
        FileDialog dialog = new FileDialog((Frame)null, "Select the first CSV file to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getDirectory() + dialog.getFile();
        
        try 
        {
           
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader reader = new CSVReaderBuilder(new FileReader(file)).withCSVParser(parser).build();

            List<String[]> allItem = reader.readAll();
            
            for(String[] row: allItem)
            {
                for (String cell : row)
                {
                    fileOne.add(cell);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        dialog.dispose();

        FileDialog dialogTwo = new FileDialog((Frame)null, "Select the second CSV file to open");
        dialogTwo.setMode(FileDialog.LOAD);
        dialogTwo.setVisible(true);
        String file_two = dialogTwo.getDirectory() + dialogTwo.getFile();

        try 
        {
           
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader reader = new CSVReaderBuilder(new FileReader(file_two)).withCSVParser(parser).build();

            List<String[]> allItem = reader.readAll();
            
            for(String[] row: allItem)
            {
                for (String cell : row)
                {
                    fileTwo.add(cell);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        fileOne.removeAll(fileTwo);
        System.out.println(fileOne);
    }
}