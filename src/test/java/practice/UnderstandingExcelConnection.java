package practice;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class UnderstandingExcelConnection {

    @Test
    public void testcase1()throws Exception{
    //Which file are we calling upon. Location of file
        String filepath="Book1.xlsx";
        //We must Load our excel file das java file (bytecode)
        FileInputStream byteCodeOfExcelFile=new FileInputStream(filepath);
        //Load our workbook as a file
        Workbook workbook = WorkbookFactory.create(byteCodeOfExcelFile);
        //The sheet that we are working on
        Sheet workSheet=workbook.getSheet("Sheet1");
    }
}
