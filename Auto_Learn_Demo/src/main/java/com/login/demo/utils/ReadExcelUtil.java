package com.login.demo.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadExcelUtil {


    public static Map<String, String> getElementData() {
        Workbook wb;
        Sheet sheet;
        Row row;
        List<Map<String, String>> list = null;
        String cellData;
        Map<String, String> map = new LinkedHashMap<String, String>();
        wb = readExcel("locator/data.xlsx");
        if (wb != null) {
            sheet = wb.getSheetAt(0);
            int rownum = sheet.getPhysicalNumberOfRows();
            for (int i = 1; i < rownum; i++) {
                row = sheet.getRow(i);
                if (row != null) {
                    String name = (String) getCellFormatValue(row.getCell(0));
                    cellData = getCellFormatValue(row.getCell(1)) + "," + getCellFormatValue(row.getCell(2));
                    map.put(name, cellData);
                } else {
                    break;
                }
            }
        }
        return map;
    }


    public static Workbook readExcel(String filePath) {
        Workbook wb = null;
        if (filePath == null) {
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            if (".xls".equals(extString)) {
                return wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return wb = new XSSFWorkbook(is);
            } else {
                return wb = null;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null) {
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC: {
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                }
                case Cell.CELL_TYPE_FORMULA: {
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cellValue = cell.getDateCellValue();
                    } else {
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING: {
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }


}