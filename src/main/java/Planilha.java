import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Planilha {
    static ArrayList<String> csv = new ArrayList<String>();

    public ArrayList<String[]> lerCSV() throws FileNotFoundException {
        try {
            FileReader filename = new FileReader("src/main/resources/print_summary_by_group(9).csv");
            CSVReader reader = new CSVReaderBuilder(filename).withSkipLines(4).withCSVParser(new CSVParserBuilder().withSeparator(';').build()).build();
            List<String[]> rows = reader.readAll();
            reader.close();

            ArrayList<String[]> data = new ArrayList<>(rows);
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
    }
        public String[] lerXLSX () {
            try (FileInputStream file = new FileInputStream(new File(String.valueOf("src/main/resources/Rateio Dezembro.xlsx")))) {
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

    public static void escreverXLSX(List<String[]> data) throws IOException {
        FileInputStream file = new FileInputStream(new File("src/main/resources/Rateio Dezembro.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 4; i < 13; ) {
            for (int j = 0; j < data.size(); j++) {
                Row row = sheet.getRow(4);
                Cell cell = row.getCell(0);
                row.setRowNum(i);
                String readCell = Arrays.toString(data.get(j));
                cell.setCellValue(readCell);
                if (j % 9 == 0) {
                    i++;
                }
            }
        }
        FileOutputStream outputStream = new FileOutputStream(("src/main/resources/Rateio Dezembro.xlsx"));
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}


