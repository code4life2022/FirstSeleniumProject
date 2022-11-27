package code4life.tests.day10;

import code4life.utilities.ConfigurationReader;
import code4life.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class GetDataAsListOfMap {


    @Test
    public void gettingDataAsListOfMap(){

        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");

        for (Map<String, String> r : util.getDataList()){
            System.out.println(r);
        }

    }


    @Test
    public void returnTotalNoOfColumn(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");
        System.out.println(util.columnCount());

    }

    @Test
    public void getColumnNames(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");
        System.out.println(util.getColumnNames());
    }

    @Test
    public void returnTotalNoOfRows(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");
        System.out.println("Total number of rows::  " + util.rowCount());
    }

    @Test
    public void getDataFromSpecificCell(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");
        System.out.println(util.getCellData(5,0));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(ConfigurationReader.getValue("site"));
    }
}
