/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import entities.Product;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author phamh
 */
public class ReadingExcelFile {
    private final int SP_MA_HANG_HOA = 2;
    private final int SP_TEN_HANG_HOA = 3;
    private final int SP_NHOM_HANG_HOA = 1;
    private final int SP_GIA_BAN = 4;
    private final int SP_GIA_VON = 5;
    private final int SP_TON_KHO = 6;
    private final int SP_DINH_MUC_TON_IT_NHAT = 8;
    private final int SP_DINH_MUC_TON_NHIEU_NHAT = 9;
    
    private XSSFSheet  sheet;
    private int sheetNumber;
    XSSFWorkbook  workbook;
    public ReadingExcelFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream(new File(fileName));
        workbook = new XSSFWorkbook(file);
        sheetNumber= 0;
        sheet = workbook.getSheetAt(sheetNumber);
    }
    
    
    public Product getProductFromFile(int rowNum){
        XSSFRow row = sheet.getRow(rowNum);
        XSSFCell  maHangHoa = row.getCell(SP_MA_HANG_HOA);
        XSSFCell  tenHangHoa = row.getCell(SP_TEN_HANG_HOA);
        XSSFCell  nhomHangHoa = row.getCell(SP_NHOM_HANG_HOA);
        XSSFCell  giaVon = row.getCell(SP_GIA_VON);
        XSSFCell  giaBan = row.getCell(SP_GIA_BAN);
        XSSFCell  tonKho = row.getCell(SP_TON_KHO);
        XSSFCell  dinhMucTonItNhat = row.getCell(SP_DINH_MUC_TON_IT_NHAT);
        XSSFCell  dinhMucTonNhieuNhat = row.getCell(SP_DINH_MUC_TON_NHIEU_NHAT);
        
        return new Product(maHangHoa, tenHangHoa, giaBan, giaVon, tonKho, nhomHangHoa, dinhMucTonItNhat, dinhMucTonNhieuNhat);
    }
    
    public int getRowsNumber(){
        return sheet.getPhysicalNumberOfRows();
    }
    
    public void closeFile(){
        try {
            this.workbook.close();
            System.out.print("\n Close file successfully");
            
        } catch (IOException ex) {
            System.out.print("\n Close file unsuccessfully");
        }
    }
}
