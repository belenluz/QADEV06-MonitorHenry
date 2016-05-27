package utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    public XSSFSheet ExcelWSheet;
    public XSSFWorkbook ExcelWBook;
    public XSSFCell Cell;
    
	public void setExcelFile(String Path,String SheetName) throws Exception {
	        FileInputStream ExcelFile = new FileInputStream(Path);
	        ExcelWBook = new XSSFWorkbook(ExcelFile);
	        ExcelWSheet = ExcelWBook.getSheet(SheetName);
	       }
	
	public String getCellData(int RowNum, int ColNum) throws Exception{
		  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		  Cell.setCellType(Cell.CELL_TYPE_STRING);
	      String CellData = Cell.getStringCellValue();
	      return CellData;
		}
	
	public int getNumberOfRows() throws Exception{
	      return ExcelWSheet.getLastRowNum();
		}

}
