package genericLibraries;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility 
{
	private Workbook wb;

	public void excelInitialization(String excelpath)
	{

		FileInputStream efis = null;
		try
		{
			efis = new FileInputStream(excelpath);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		try 
		{
			wb = WorkbookFactory.create(efis);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public String fetchDataFromExcel(String sheetName, int rowNum,int cellNum)
	{
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}
	public List<String> fetchDataFromExcel(String sheetName)
	{
		List<String> dataList=new ArrayList<>();
		Sheet sheet=wb.getSheet(sheetName);
//		int r=sheet.getLastRowNum();
//		int c=sheet.getRow(0).getLastCellNum();
	
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
//			Row row=sheet.getRow(i);
			String data=sheet.getRow(i).getCell(1).getStringCellValue();
			dataList.add(data);
			
		}
		return dataList;
		
	}
	public void closeExcel()
	{
		try
		{
			wb.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
