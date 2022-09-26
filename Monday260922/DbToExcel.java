package Monday260922;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DbToExcel {
 
    public static void main(String[] args) {
        new DbToExcel().export();
    }
     
    public void export() {
        String jdbcURL = "jdbc:mysql://localhost:3306/hrd";
        String username = "root";
        String password = "";
 
        String excelFilePath = "Officers-Data.xlsx";
 
        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "SELECT * FROM officers";
 
            Statement statement = connection.createStatement();
 
            ResultSet result = statement.executeQuery(sql);
 
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("officers");
 
            writeHeaderLine(sheet);
 
            writeDataLines(result, workbook, sheet);
 
            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
 
            statement.close();
 
        } catch (SQLException e) {
            System.out.println("Datababse error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }
    }
 
    private void writeHeaderLine(XSSFSheet sheet) {
 
        Row headerRow = sheet.createRow(0);
 
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("OfficerName");
 
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("OfficerPCno");
 
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("Designation");
 
    }
 
    private void writeDataLines(ResultSet result, XSSFWorkbook workbook,
            XSSFSheet sheet) throws SQLException {
        int rowCount = 1;
 
        while (result.next()) {
            String OfficerName = result.getString("OfficerName");
            String OfficerPcno = result.getString("OfficerPCno");
            String Designation = result.getString("Designation");
           
            Row row = sheet.createRow(rowCount++);
 
            int columnCount = 0;
            Cell cell = row.createCell(columnCount++);
            cell.setCellValue(OfficerName);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(OfficerPcno);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(Designation);
 
        }
    }
}