import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Planilha {
    ArrayList<String> csv = new ArrayList<String>();

    public String[] lerCSV() throws FileNotFoundException {
        String[] csv = new String[0];
        FileReader file = new FileReader("src/main/resources/print_summary_by_group(9).csv");
        try (CSVReader csvReader = new CSVReaderBuilder(file).withSkipLines(4).withCSVParser(new CSVParserBuilder().withSeparator(';').build()).build()) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                csv = values;
                System.out.println(Arrays.toString(csv));
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }
        return csv;
    }

    public String[] lerXLSX() throws FileNotFoundException {
        try(FileInputStream file = new FileInputStream(new File(String.valueOf("src/main/resources/Rateio Dezembro.xlsx")))){
           Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet("src/main/resources/Rateio Dezembro.xlsx");
            Iterator<Row> rowIterator = sheet.iterator();
            for (Row row : sheet) {
                Iterator<Cell> cellIterator = row.cellIterator();
                for (Cell cell : row) {
                    cell.getStringCellValue();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void escreverXLSX(String [] csv) throws IOException {
        FileInputStream file = new FileInputStream(new File(String.valueOf("src/main/resources/Rateio Dezembro.xlsx")));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet("src/main/resources/Rateio Dezembro.xlsx");
        String[] parts;
        //parts = csv.split(",");
        for (int i = 0; i < 5; i++) {
            
        }


    }
}

