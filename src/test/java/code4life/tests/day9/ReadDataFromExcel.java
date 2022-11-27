package code4life.tests.day9;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ReadDataFromExcel {
    @Test
    public void readExcelFileTest() throws IOException {
        File file = new File("Book2.xlsx");
        Workbook book = WorkbookFactory.create(file);
        Sheet workSheet = book.getSheet("Sheet1");
        Row firstRow = workSheet.getRow(3);
        Cell firstCell = firstRow.getCell(0);
        String value  = firstCell.getStringCellValue();
        System.out.println("First Cell Value = "+ value);

        String secondCellValue = firstRow.getCell(1).getStringCellValue();
        System.out.println("secondCellValue = " + secondCellValue);

        int lastCell= firstRow.getLastCellNum();
        System.out.println("Printing all values from first row::");

        for (int i = 0; i <lastCell ; i++) {
            System.out.print(firstRow.getCell(i)+ " | ");

        }
        System.out.println();

        int numOfRows = workSheet.getLastRowNum();
        System.out.println("Total number of rows = "+ numOfRows);
        System.out.println();

        System.out.println("Printing all values from all columns:: \n");

        for (int i = 0; i < workSheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j <workSheet.getRow(i).getLastCellNum() ; j++) {
                String cellValue = workSheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(cellValue + " | ");

            }

            System.out.println();

        }



    }
}
