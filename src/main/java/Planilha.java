import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Planilha {
    ArrayList<String> csv = new ArrayList<String>();

    public String[] lerCSV() throws FileNotFoundException {
        String [] csv = new String[0];
        FileReader file = new FileReader("src/main/resources/print_summary_by_group(9).csv");
        try(CSVReader csvReader = new CSVReaderBuilder(file).withSkipLines(4).withCSVParser(new CSVParserBuilder().withSeparator(';').build()).build()){
            String [] values = null;
            while((values = csvReader.readNext())!=null) {
                csv = values;
                System.out.println(Arrays.toString(csv));
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }
        return csv;
    }

    public String[] lerXLSX(){

        return null;
    }

    public void escreverXLSX(){

    }
}

